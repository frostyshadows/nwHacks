package com.tigeroakes.pacmanmaps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

/**
 * Created by tiger on 27-Feb-16.
 */
public class Paths {
	public ArrayList<Polyline> d;

	public Paths(GoogleMap map) {
		d = new ArrayList<Polyline>();
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25037, 49.26204),
				new LatLng(-123.25058, 49.26201),
				new LatLng(-123.25066, 49.26200),
				new LatLng(-123.25072, 49.26199),
				new LatLng(-123.25100, 49.26198),
				new LatLng(-123.25111, 49.26210),
				new LatLng(-123.25126, 49.26207),
				new LatLng(-123.25138, 49.26187),
				new LatLng(-123.25122, 49.26172),
				new LatLng(-123.25114, 49.26169),
				new LatLng(-123.25100, 49.26166),
				new LatLng(-123.25085, 49.26166),
				new LatLng(-123.25067, 49.26168),
				new LatLng(-123.25053, 49.26169),
				new LatLng(-123.25042, 49.26171)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25120, 49.26384),
				new LatLng(-123.25126, 49.26378),
				new LatLng(-123.25166, 49.26364),
				new LatLng(-123.25167, 49.26364)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25063, 49.26402),
				new LatLng(-123.25041, 49.26377),
				new LatLng(-123.25040, 49.26377),
				new LatLng(-123.25040, 49.26376),
				new LatLng(-123.25041, 49.26375),
				new LatLng(-123.25104, 49.26354),
				new LatLng(-123.25063, 49.26303),
				new LatLng(-123.25067, 49.26303),
				new LatLng(-123.25064, 49.26299),
				new LatLng(-123.25064, 49.26298),
				new LatLng(-123.25065, 49.26298),
				new LatLng(-123.25075, 49.26261),
				new LatLng(-123.25071, 49.26262),
				new LatLng(-123.25062, 49.26266),
				new LatLng(-123.25050, 49.26270),
				new LatLng(-123.25040, 49.26275),
				new LatLng(-123.25036, 49.26277),
				new LatLng(-123.25034, 49.26279),
				new LatLng(-123.25032, 49.26282),
				new LatLng(-123.25031, 49.26284)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25317, 49.26284),
				new LatLng(-123.25317, 49.26285),
				new LatLng(-123.25296, 49.26320),
				new LatLng(-123.25295, 49.26321),
				new LatLng(-123.25293, 49.26322),
				new LatLng(-123.25291, 49.26324),
				new LatLng(-123.25267, 49.26332),
				new LatLng(-123.25216, 49.26351),
				new LatLng(-123.25193, 49.26324),
				new LatLng(-123.25155, 49.26273),
				new LatLng(-123.25200, 49.26257),
				new LatLng(-123.25161, 49.26210),
				new LatLng(-123.25182, 49.26204),
				new LatLng(-123.25181, 49.26204),
				new LatLng(-123.25132, 49.26208),
				new LatLng(-123.25129, 49.26208),
				new LatLng(-123.25126, 49.26207)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25331, 49.26279),
				new LatLng(-123.25317, 49.26284),
				new LatLng(-123.25265, 49.26303),
				new LatLng(-123.25261, 49.26304),
				new LatLng(-123.25257, 49.26305),
				new LatLng(-123.25253, 49.26306),
				new LatLng(-123.25249, 49.26305),
				new LatLng(-123.25245, 49.26304),
				new LatLng(-123.25241, 49.26303),
				new LatLng(-123.25237, 49.26301),
				new LatLng(-123.25233, 49.26297),
				new LatLng(-123.25229, 49.26293),
				new LatLng(-123.25200, 49.26257)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.24994, 49.26113),
				new LatLng(-123.24970, 49.26122),
				new LatLng(-123.24938, 49.26132),
				new LatLng(-123.24928, 49.26136),
				new LatLng(-123.24925, 49.26141),
				new LatLng(-123.24920, 49.26145),
				new LatLng(-123.24912, 49.26147),
				new LatLng(-123.24891, 49.26155),
				new LatLng(-123.24887, 49.26159),
				new LatLng(-123.24878, 49.26162),
				new LatLng(-123.24867, 49.26163)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25338, 49.26172),
				new LatLng(-123.25335, 49.26173),
				new LatLng(-123.25329, 49.26173),
				new LatLng(-123.25324, 49.26173),
				new LatLng(-123.25318, 49.26173),
				new LatLng(-123.25314, 49.26173),
				new LatLng(-123.25310, 49.26173),
				new LatLng(-123.25306, 49.26175),
				new LatLng(-123.25304, 49.26175),
				new LatLng(-123.25302, 49.26177),
				new LatLng(-123.25296, 49.26181),
				new LatLng(-123.25291, 49.26185),
				new LatLng(-123.25288, 49.26187),
				new LatLng(-123.25284, 49.26188),
				new LatLng(-123.25279, 49.26189),
				new LatLng(-123.25274, 49.26190),
				new LatLng(-123.25268, 49.26190),
				new LatLng(-123.25262, 49.26190),
				new LatLng(-123.25258, 49.26189),
				new LatLng(-123.25256, 49.26189),
				new LatLng(-123.25253, 49.26188),
				new LatLng(-123.25249, 49.26188),
				new LatLng(-123.25244, 49.26187),
				new LatLng(-123.25239, 49.26187),
				new LatLng(-123.25234, 49.26188),
				new LatLng(-123.25229, 49.26189),
				new LatLng(-123.25228, 49.26190),
				new LatLng(-123.25182, 49.26204),
				new LatLng(-123.25161, 49.26210),
				new LatLng(-123.25092, 49.26231),
				new LatLng(-123.25068, 49.26239)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25193, 49.26324),
				new LatLng(-123.25172, 49.26332),
				new LatLng(-123.25148, 49.26340),
				new LatLng(-123.25104, 49.26354)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.24918, 49.26058),
				new LatLng(-123.24970, 49.26122),
				new LatLng(-123.25037, 49.26204),
				new LatLng(-123.25068, 49.26239),
				new LatLng(-123.25083, 49.26258),
				new LatLng(-123.25111, 49.26293),
				new LatLng(-123.25148, 49.26340),
				new LatLng(-123.25167, 49.26364),
				new LatLng(-123.25184, 49.26385)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
				new LatLng(-123.25211, 49.26377),
				new LatLng(-123.25181, 49.26342),
				new LatLng(-123.25172, 49.26332),
				new LatLng(-123.25092, 49.26231),
				new LatLng(-123.25066, 49.26200),
				new LatLng(-123.25042, 49.26171),
				new LatLng(-123.24994, 49.26113),
				new LatLng(-123.24940, 49.26048)
		).visible(false)));
	}
}
