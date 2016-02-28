package com.tigeroakes.pacmanmaps;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by sherryyuan on 16-02-28.
 */
public class Player extends Location {
    private LatLng pos;
    public int PointPerPellet = 100; //why isn't this in pellets class instead??

    public Player(String provider) {
        super(provider);
    }

    public void updatePlayer() {
    }
}
