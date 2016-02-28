package com.tigeroakes.pacmanmaps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
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
        marker = gmap.addMarker(new MarkerOptions().position(pos).title("Player")
                .icon(getBitmap(drawable)).anchor(0.5f, 0.5f));
    }

    private BitmapDescriptor getBitmap(Drawable id) {
        VectorDrawable vectorDrawable = (VectorDrawable) id;

        int h = vectorDrawable.getIntrinsicHeight();
        int w = vectorDrawable.getIntrinsicWidth();

        vectorDrawable.setBounds(0, 0, w, h);

        Bitmap bm = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bm);
        vectorDrawable.draw(canvas);

        return BitmapDescriptorFactory.fromBitmap(bm);
    }

    public Marker getMarker() {
        return marker;
    }

    public void updatePlayer(double lat, double lng) {
        LatLng latLng = new LatLng(lat, lng);
        marker.setPosition(latLng);
    }

}
