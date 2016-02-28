package com.tigeroakes.pacmanmaps;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

	private GoogleMap mMap;
	private List<Ghost> ghosts;
	private List<Marker> ghostMarkers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		// Obtain the SupportMapFragment and get notified when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
		// createTextOverlay();

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
		for (int i = 0; i < 4; i++){
			// TODO: figure out arguments!!
			Ghost ghost = new Ghost(0, 0, 0, 0, 0, new LatLng(0, 0));
			Marker marker = mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
			marker.setPosition(ghost.getLatLng());
			marker.setIcon(R.mipmap.ghost);

		}

	}

	class PlayingArea {
		public ArrayList<LatLng> area;
		public Polygon polygon;

		// Generates playing area for game, based on user selected points
		public PlayingArea() {
			//TODO: Replace stub code
			area.add(new LatLng(-123.25207469999998,49.26244859999999));
			area.add(new LatLng(-123.2511789,49.261457899999996));
			area.add(new LatLng(-123.2495534,49.261773));
			area.add(new LatLng(-123.2505405,49.262945699999996));

			area.add(area.get(0));

			//TODO: Create Polygon item with coordinates
			polygon = mMap.addPolygon(new PolygonOptions().addAll(area));
		}

		//Check if item is within the playing area
		public boolean withinArea(LatLng marker) {
			// TODO: make sure area.get(0) and area.get(2) are the correct points, SW and NE
			LatLngBounds bounds = new LatLngBounds(area.get(0), area.get(2));
			return bounds.contains(marker);
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
	public class Score {
		public int InitialScore = 0;
		public int scoreSoFar;

		public Score() {
			scoreSoFar = InitialScore;
		}

		public void AddScore(int score) {
			scoreSoFar =+ score;
		}

		public int GetScore() {
			return scoreSoFar;
		}


	}

	class Player {
		private LatLng pos;
		public int PointPerPellet = 100;


		//TODO: Track player location
	}
}
