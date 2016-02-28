package com.tigeroakes.pacmanmaps;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by sherryyuan on 16-02-28.
 */
public class Player {
    private LatLng pos;
    public int pointPerPellet = 100;
    private Marker marker;

    public Player(GoogleMap gmap, double lat, double lng, Drawable drawable) {
        pos = new LatLng(lat, lng);
        marker = gmap.addMarker(new MarkerOptions().position(pos).title("Player"));
        Drawable myDrawable = drawable;
        Bitmap anImage = ((BitmapDrawable) myDrawable).getBitmap();
        BitmapDescriptor bmDescriptor = BitmapDescriptorFactory.fromBitmap(anImage);
        marker.setIcon(bmDescriptor);
        marker.setAnchor(0.5f, 0.5f);
    }

    public Marker getMarker() {
        return marker;
    }

    public void updatePlayer(double lat, double lng) {
        LatLng latLng = new LatLng(lat, lng);
        marker.setPosition(latLng);
    }

}
