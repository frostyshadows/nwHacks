package com.tigeroakes.pacmanmaps;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.util.Log;
import android.app.Activity.*;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Logic for ghosts that follow pac-man around
 */

public class Ghost extends Activity{
    private LatLng pos;
    private double speed;
    private Random random;
    double ghostSizeX;
    double ghostSizeY;
    Marker ghostMarker;
    Context context;
    LatLng playerPosition;
    Timer timer;

    public Ghost(double minY, double maxY, double minX, double maxX, double playerRadius, LatLng playerPos, GoogleMap mMap
    , Context context) {
        // Constructor
        random = new Random();
        speed = (0.01)/ 15;
        timer = new Timer();

        double ghostX = 0;
        double ghostY = 0;

        double playerDist;
        ghostSizeX = 0.5;
        ghostSizeY = 0.5;

        this.context = context;
        playerPosition = playerPos;
        int cyclesRan = 0;
        //playerRadius is the minimum distance the ghost can be from the player in order for the ghost to spawn

        do {
            // makes the ghost a uniformly distributed random position in between minX, maxX for x and minY, maxY for y
            ghostX = (random.nextDouble() * (maxX - minX)) + minX;
            ghostY = (random.nextDouble() * (maxY - minY)) + minY;

            pos = new LatLng(ghostX, ghostY);
            double distX = Math.abs(ghostX - playerPos.latitude);
            double distY = Math.abs(ghostY - playerPos.longitude);
            playerDist = Math.sqrt((distX * distX) + (distY * distY));
            cyclesRan++;
        } while (playerDist < playerRadius && cyclesRan < 200);

        if (cyclesRan > 200) {
            //TODO:throw error here because this means that the box radius was probably smaller than the minimum range you can spawn a ghost
        }
        // above code should make it so the ghost won't spawn within player radius

        // the marker on the map of the ghost
        ghostMarker = mMap.addMarker(new MarkerOptions().position(pos).title("Ghost"));

        Drawable myDrawable = context.getDrawable(R.mipmap.ghost);
        Bitmap anImage = ((BitmapDrawable) myDrawable).getBitmap();
        BitmapDescriptor bmDescriptor = BitmapDescriptorFactory.fromBitmap(anImage);
        ghostMarker.setIcon(bmDescriptor);


        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        //update ui
                        update();

                    }
                });
            }
        }, 1000, 1000);

    }

    public void setPlayerPosition (LatLng pPos) {
        playerPosition = pPos;
    }

   public LatLng getLatLng() {
       return pos;
   }

    public void update() {
        //TODO: figure out how to find time passed since last pos update and test this code

        //calc dist between ghost and player
        double distX = playerPosition.latitude - pos.latitude;
        double distY = playerPosition.longitude - pos.longitude;

        //this code should make the ghost move exactly towards the player
        double speedX = (distX/(Math.abs(distX) + Math.abs(distY))) * speed;
        double speedY = (distY/(Math.abs(distX)+ Math.abs(distY)))* speed;


        //this code is placeholder and does not work yet because i dont know how to find the time passed since last update
        //PLACEHOLDER CODE
        pos = new LatLng(pos.latitude + speedX, pos.longitude + speedY);

        //REAL CODE SHOULD USE TIMEPASSED LIKE THIS BUT IDK HOW TO DO THAT
        /*
        pos.latitude += speedX * timePassedSinceLastUpdate;
        pos.longitude += speedY * timePassedSinceLastUpdate;
        */
        ghostMarker.setPosition(pos);

        //TODO: add collision detection between player and ghost here
        double playerSizeX = 0.5;
        double playerSizeY = 0.5;


        RectF playerRect = new RectF((float)(playerPosition.latitude - playerSizeX), (float)(playerPosition.longitude - playerSizeY),
                (float)(playerPosition.latitude + playerSizeX), (float)(playerPosition.longitude + playerSizeY));

        RectF ghostRect = new RectF((float)(pos.latitude - ghostSizeX), (float)(pos.longitude - ghostSizeY),
                (float)(pos.latitude + ghostSizeX), (float)(pos.longitude + ghostSizeY));


        if (playerRect.contains(ghostRect)) {
            //TODO: add the code that does what should be done when the ghost hits the player here
            //i.e probably remove a life from the player and reset the gamestate
        }


    }



}
