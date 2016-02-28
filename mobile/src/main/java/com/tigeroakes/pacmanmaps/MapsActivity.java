package com.tigeroakes.pacmanmaps;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		// Obtain the SupportMapFragment and get notified when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
	}


	/**
	 * Manipulates the map once available.
	 * This callback is triggered when the map is ready to be used.
	 * This is where we can add markers or lines, add listeners or move the camera. In this case,
	 * we just add a marker near Sydney, Australia.
	 * If Google Play services is not installed on the device, the user will be prompted to install
	 * it inside the SupportMapFragment. This method will only be triggered once the user has
	 * installed Google Play services and returned to the app.
	 */
	@Override
	public void onMapReady(GoogleMap googleMap) {
		mMap = googleMap;

		// Add a marker in Sydney and move the camera
		LatLng sydney = new LatLng(-34, 151);
		mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
		mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
	}

	class PlayingArea {
		public LatLng[] area;
		public Polygon polygon;

		// Generates playing area for game, based on the starting position.
		public PlayingArea(LatLng startPos) {
			//TODO: Replace stub code
			area = new LatLng[4];
			area[0] = new LatLng(-123.25207469999998,49.26244859999999);
			area[1] = new LatLng(-123.2511789,49.261457899999996);
			area[2] = new LatLng(-123.2495534,49.261773);
			area[3] = new LatLng(-123.2505405,49.262945699999996);

			//TODO: Create Polygon item with coordinates
		}

		//Check if item is within the playing area
		public boolean withinArea(LatLng marker) {

			return false;
		}
	}

	public class Pellet {
		public LatLng pos;
		public Marker marker;

		public Pellet(LatLng lPos) {
			pos = lPos;
			marker = mMap.addMarker(new MarkerOptions()
					.position(pos));
			//TODO: Add icon and anchor
		}
	}

	class Player {
		private LatLng pos;



		//TODO: Track player location
	}
}
