package com.tigeroakes.pacmanmaps;

import android.location.Location;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by sherryyuan on 16-02-28.
 */
public class Player {
    private LatLng pos;
    public int PointPerPellet = 100; //why isn't this in pellets class instead??
    private Marker marker;

    public Player(GoogleMap gmap, double lat, double lng) {
        pos = new LatLng(lat, lng);
        marker = gmap.addMarker(new MarkerOptions().position(pos).title("Player"));
    }

    public Marker getMarker() {
        return marker;
    }

    public void updatePlayer(double lat, double lng) {
        LatLng latLng = new LatLng(lat, lng);
        marker.setPosition(latLng);
    }
}
