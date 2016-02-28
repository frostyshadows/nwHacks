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
		d = new ArrayList<>();
		d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26204, -123.25037),
			new LatLng(49.26201, -123.25058),
			new LatLng(49.26200, -123.25066),
			new LatLng(49.26199, -123.25072),
			new LatLng(49.26198, -123.25100),
			new LatLng(49.26210, -123.25111),
			new LatLng(49.26207, -123.25126),
			new LatLng(49.26187, -123.25138),
			new LatLng(49.26172, -123.25122),
			new LatLng(49.26169, -123.25114),
			new LatLng(49.26166, -123.25100),
			new LatLng(49.26166, -123.25085),
			new LatLng(49.26168, -123.25067),
			new LatLng(49.26169, -123.25053),
			new LatLng(49.26171, -123.25042)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26384, -123.25120),
			new LatLng(49.26378, -123.25126),
			new LatLng(49.26364, -123.25166),
			new LatLng(49.26364, -123.25167)
		).visible(false)));
		d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26402, -123.25063),
			new LatLng(49.26377, -123.25041),
			new LatLng(49.26377, -123.25040),
			new LatLng(49.26376, -123.25040),
			new LatLng(49.26375, -123.25041),
			new LatLng(49.26354, -123.25104),
			new LatLng(49.26303, -123.25063),
			new LatLng(49.26303, -123.25067),
			new LatLng(49.26299, -123.25064),
			new LatLng(49.26298, -123.25064),
			new LatLng(49.26298, -123.25065),
			new LatLng(49.26261, -123.25075),
			new LatLng(49.26262, -123.25071),
			new LatLng(49.26266, -123.25062),
			new LatLng(49.26270, -123.25050),
			new LatLng(49.26275, -123.25040),
			new LatLng(49.26277, -123.25036),
			new LatLng(49.26279, -123.25034),
			new LatLng(49.26282, -123.25032),
			new LatLng(49.26284, -123.25031)
		).visible(false)));
		 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26284, -123.25317),
			new LatLng(49.26285, -123.25317),
			new LatLng(49.26320, -123.25296),
			new LatLng(49.26321, -123.25295),
			new LatLng(49.26322, -123.25293),
			new LatLng(49.26324, -123.25291),
			new LatLng(49.26332, -123.25267),
			new LatLng(49.26351, -123.25216),
			new LatLng(49.26324, -123.25193),
			new LatLng(49.26273, -123.25155),
			new LatLng(49.26257, -123.25200),
			new LatLng(49.26210, -123.25161),
			new LatLng(49.26204, -123.25182),
			new LatLng(49.26204, -123.25181),
			new LatLng(49.26208, -123.25132),
			new LatLng(49.26208, -123.25129),
			new LatLng(49.26207, -123.25126)
		).visible(false)));
		 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26279, -123.25331),
			new LatLng(49.26284, -123.25317),
			new LatLng(49.26303, -123.25265),
			new LatLng(49.26304, -123.25261),
			new LatLng(49.26305, -123.25257),
			new LatLng(49.26306, -123.25253),
			new LatLng(49.26305, -123.25249),
			new LatLng(49.26304, -123.25245),
			new LatLng(49.26303, -123.25241),
			new LatLng(49.26301, -123.25237),
			new LatLng(49.26297, -123.25233),
			new LatLng(49.26293, -123.25229),
			new LatLng(49.26257, -123.25200)
		).visible(false)));
		 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26113, -123.24994),
			new LatLng(49.26122, -123.24970),
			new LatLng(49.26132, -123.24938),
			new LatLng(49.26136, -123.24928),
			new LatLng(49.26141, -123.24925),
			new LatLng(49.26145, -123.24920),
			new LatLng(49.26147, -123.24912),
			new LatLng(49.26155, -123.24891),
			new LatLng(49.26159, -123.24887),
			new LatLng(49.26162, -123.24878),
			new LatLng(49.26163, -123.24867)
		).visible(false)));
		 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26172, -123.25338),
			new LatLng(49.26173, -123.25335),
			new LatLng(49.26173, -123.25329),
			new LatLng(49.26173, -123.25324),
			new LatLng(49.26173, -123.25318),
			new LatLng(49.26173, -123.25314),
			new LatLng(49.26173, -123.25310),
			new LatLng(49.26175, -123.25306),
			new LatLng(49.26175, -123.25304),
			new LatLng(49.26177, -123.25302),
			new LatLng(49.26181, -123.25296),
			new LatLng(49.26185, -123.25291),
			new LatLng(49.26187, -123.25288),
			new LatLng(49.26188, -123.25284),
			new LatLng(49.26189, -123.25279),
			new LatLng(49.26190, -123.25274),
			new LatLng(49.26190, -123.25268),
			new LatLng(49.26190, -123.25262),
			new LatLng(49.26189, -123.25258),
			new LatLng(49.26189, -123.25256),
			new LatLng(49.26188, -123.25253),
			new LatLng(49.26188, -123.25249),
			new LatLng(49.26187, -123.25244),
			new LatLng(49.26187, -123.25239),
			new LatLng(49.26188, -123.25234),
			new LatLng(49.26189, -123.25229),
			new LatLng(49.26190, -123.25228),
			new LatLng(49.26204, -123.25182),
			new LatLng(49.26210, -123.25161),
			new LatLng(49.26231, -123.25092),
			new LatLng(49.26239, -123.25068)
		).visible(false)));
		 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26324, -123.25193),
			new LatLng(49.26332, -123.25172),
			new LatLng(49.26340, -123.25148),
			new LatLng(49.26354, -123.25104)
	).visible(false)));
	 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26058, -123.24918),
			new LatLng(49.26122, -123.24970),
			new LatLng(49.26204, -123.25037),
			new LatLng(49.26239, -123.25068),
			new LatLng(49.26258, -123.25083),
			new LatLng(49.26293, -123.25111),
			new LatLng(49.26340, -123.25148),
			new LatLng(49.26364, -123.25167),
			new LatLng(49.26385, -123.25184)
).visible(false)));
 d.add(map.addPolyline(new PolylineOptions().add(
			new LatLng(49.26377, -123.25211),
			new LatLng(49.26342, -123.25181),
			new LatLng(49.26332, -123.25172),
			new LatLng(49.26231, -123.25092),
			new LatLng(49.26200, -123.25066),
			new LatLng(49.26171, -123.25042),
			new LatLng(49.26113, -123.24994),
			new LatLng(49.26048, -123.24940)
).visible(false)));

	}
}
