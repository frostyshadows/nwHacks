package com.tigeroakes.pacmanmaps;

import android.graphics.RectF;

import com.google.android.gms.maps.model.LatLng;

/**
 * Logic for ghosts that follow pac-man around
 */

public class Ghost {
    private LatLng pos;
    private int speed;

    public Ghost() {
        // Constructor
        //TODO: make the latlng start a random pos greater than a certain dist away from player and within borders


    }

    public void update(LatLng playerPos) {
        //TODO: uncomment out all of this code when can find out how much time has passed since last update and can make ghost and player coords successfully
        /*

        //TODO: figure out how to find time passed since last pos update and test this code

        //calc dist between ghost and player
        double distX = playerPos.latitude - pos.latitude;
        double distY = playerPos.longitude - pos.longitude;

        //this code should make the ghost move exactly towards the player
        double speedX = (distX/(Math.abs(distX) + Math.abs(distY))) * speed;
        double speedY = (distY/(Math.abs(distX)+ Math.abs(distY)))* speed;

        //this code is placeholder and does not work yet because i dont know how to find the time passed since last update
        pos.latitude += speedX * timePassedSinceLastUpdate;
        pos.longitude += speedY * timePassedSinceLastUpdate;


        //TODO: add collision detection between player and ghost here
        double playerSizeX = 0.5;
        double playerSizeY = 0.5;
        double ghostSizeX = 0.5;
        double ghostSizeY = 0.5;

        RectF playerRect = new RectF((float)(playerPos.latitude - playerSizeX), (float)(playerPos.longitude - playerSizeY),
                (float)(playerPos.latitude + playerSizeX), (float)(playerPos.longitude + playerSizeY));

        RectF ghostRect = new RectF((float)(pos.latitude - ghostSizeX), (float)(pos.longitude - ghostSizeY),
                (float)(pos.latitude + ghostSizeX), (float)(pos.longitude + ghostSizeY));

        if (playerRect.contains(ghostRect)) {
            //TODO: add the code that does what should be done when the ghost hits the player here
            //i.e probably remove a life from the player and reset the gamestate
        }

       */
    }



}
