package com.tigeroakes.pacmanmaps;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by tiffanyxu on 16-02-27.
 */
public class Food {
    private static int PointPerFood = 100;
    private LatLng position;

    public void Food(LatLng position) {
        this.position = position;
    }

    public LatLng GetPosition() {
        return position;
    }

}
