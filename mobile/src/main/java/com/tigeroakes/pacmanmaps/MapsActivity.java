package com.tigeroakes.pacmanmaps;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

	private GoogleMap mMap;
	private TextView textView;
	private static Score score;
	private List<Ghost> ghosts;
	private Player player;
	private LocationManager lm;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		// Obtain the SupportMapFragment and get notified when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
		// createTextOverlay();
		textView = (TextView) findViewById(R.id.score_id);
		textView.setText("Score: 0");

		score = new Score();
		// TODO: 0, 0 shouldn't be the right coordinates
		player = new Player(mMap, 0, 0);

		lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
			// TODO: Consider calling
			//    ActivityCompat#requestPermissions
			// here to request the missing permissions, and then overriding
			//   public void onRequestPermissionsResult(int requestCode, String[] permissions,
			//                                          int[] grantResults)
			// to handle the case where the user grants the permission. See the documentation
			// for ActivityCompat#requestPermissions for more details.
			return;
		}
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, new LocationListener() {
			@Override
			public void onLocationChanged(Location location) {
				updateText();
				player.updatePlayer(location.getLatitude(), location.getLongitude());

//		for (Ghost next: ghosts){
//			next.update();
//		}
				// TODO: ghosts should move
				// TODO: player should move
				// TODO: ghost should move
			}

			@Override
			public void onProviderDisabled(String provider) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onProviderEnabled(String provider) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onStatusChanged(String provider, int status,
										Bundle extras) {
				// TODO Auto-generated method stub
			}
		});
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

		for (int i = 0; i < 4; i++) {
			Ghost ghost = new Ghost(sydney.longitude - 3, sydney.longitude + 3, sydney.latitude - 3, sydney.latitude + 3, 1, sydney, mMap, this.getApplicationContext());
			ghosts.add(ghost);
		}
		if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
			// TODO: Consider calling
			//    ActivityCompat#requestPermissions
			// here to request the missing permissions, and then overriding
			//   public void onRequestPermissionsResult(int requestCode, String[] permissions,
			//                                          int[] grantResults)
			// to handle the case where the user grants the permission. See the documentation
			// for ActivityCompat#requestPermissions for more details.
			return;
		}
		googleMap.setMyLocationEnabled(true);
	}

//	@Override
//	public void onLocationChanged(Location location) {
//		updateText();
//		player.updatePlayer(location.getLatitude(), location.getLongitude());
//
////		for (Ghost next: ghosts){
////			next.update();
////		}
//		// TODO: ghosts should move
//		// TODO: player should move
//		// TODO: ghost should move
//
//	}

	public void updateText(){
		String text = String.valueOf(score.GetScore());
		textView.setText(text);
	}

	public class Navigator {
		public LatLng point1;
		public LatLng point2;

		double radLat1;
		double radLat2;
		double radLng1;
		double radLng2;
		double radLatDelta;
		double radLngDelta;

		int R = 6371000;

		public Navigator(LatLng p1, LatLng p2) {
			point1 = p1;
			point2 = p2;

			radLat1 = Math.toRadians(p1.latitude);
			radLat2 = Math.toRadians(p2.latitude);
			radLng1 = Math.toRadians(p1.longitude);
			radLng2 = Math.toRadians(p2.longitude);
			radLatDelta = Math.toRadians(p2.latitude - p1.latitude);
			radLngDelta = Math.toRadians(p2.longitude - p1.longitude);
		}

		public double distance() {
			double a = Math.sin(radLatDelta/2) * Math.sin(radLatDelta/2) +
					Math.cos(radLat1) * Math.cos(radLat2) * Math.sin(radLngDelta/2) * Math.sin(radLngDelta/2);
			return (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a))) * R;
		}

		public double bearing() {
			double y = Math.sin(radLng2-radLng1) * Math.cos(radLat2);
			double x = Math.cos(radLat1) * Math.sin(radLat2) -
					Math.sin(radLat1) * Math.cos(radLat2) * Math.cos(radLng2 - radLng1);
			return Math.toDegrees(Math.atan2(y, x));
		}

		public LatLng towards(LatLng start, double brng, double d) {
			double lat1 = Math.toRadians(start.latitude);
			double lat2 = Math.asin(Math.sin(lat1)*Math.cos(d/R) +
					Math.cos(lat1)*Math.sin(d/R)*Math.cos(brng));
			double lon2 = Math.toRadians(start.longitude) +
					Math.atan2(Math.sin(brng)*Math.sin(d/R)*Math.cos(lat1),
					Math.cos(d/R)-Math.sin(lat1)*Math.sin(lat2));
			return new LatLng(Math.toDegrees(lat2), Math.toDegrees(lon2));
		}
	}

	public ArrayList<Pellet> placePellets(double spacing, ArrayList<Polyline> paths) {
		ArrayList<Pellet> pellets = new ArrayList<>();
		for (Polyline path : paths) {
			List<LatLng> points = path.getPoints();
			double distanceLeft = 0;
			for (int i = 1; i < points.size(); i++) {
				Navigator n = new Navigator(points.get(i - 1), points.get(i));
				double distance = n.distance();
				if (distanceLeft < distance) {
					double d = distance - distanceLeft;
					LatLng lastPoint = (distanceLeft == 0) ?
							n.point1 : n.towards(n.point1, n.bearing(), distanceLeft);
					pellets.add(new Pellet(lastPoint));
					while (d > spacing) {
						d -= spacing;
						lastPoint = n.towards(lastPoint, n.bearing(), d);
						pellets.add(new Pellet(lastPoint));
					}
					distanceLeft = d;
				}
			}
		}
		return pellets;
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
			Drawable myDrawable = getResources().getDrawable(R.drawable.pellet_dot);
			Bitmap anImage = ((BitmapDrawable) myDrawable).getBitmap();
			BitmapDescriptor bmDescriptor = BitmapDescriptorFactory.fromBitmap(anImage);
			marker.setIcon(bmDescriptor);
			marker.setAnchor(0.5f, 0.5f);
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


	// moved it to separate folder
//	class Player {
//		private LatLng pos;
//		public int PointPerPellet = 100; //why isn't this in pellets class instead??
//
//		public void updatePlayer(){
//		}
//		//TODO: Track player location
//	}
}