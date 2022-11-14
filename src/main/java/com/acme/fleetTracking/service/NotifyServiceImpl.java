package com.acme.fleetTracking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.fleetTracking.entity.GeoLocation;
import com.acme.fleetTracking.entity.Route;
import com.acme.fleetTracking.model.PolyLine;
import com.acme.fleetTracking.repository.GeoLocationRepositroy;
import com.acme.fleetTracking.repository.RouteRepository;

@Service
public class NotifyServiceImpl implements NotifyService {

	@Autowired
	private GeoLocationRepositroy geoLocationRepo;
	
	@Autowired
	private RouteRepository routeRepository;
		
	public boolean checkDeviation(String deviceId) {
		//get  geo location added just now to get its lat long 
		List<GeoLocation> geolocs= geoLocationRepo.findByDeviceId(deviceId);
		GeoLocation geoloc=new GeoLocation();
		if(!geolocs.isEmpty()) {
			geoloc=geolocs.get(0);
			//use device id to get polyline from route table...
			Optional<Route> dbRoute=routeRepository.findById(deviceId);
			Route route=dbRoute.isEmpty()?new Route():dbRoute.get();
			String polyLine=route.getPolyline();
			List<PolyLine> polylines=convetToList(polyLine);
			
			// check for nearest polyline to geolocation
			PolyLine geolocObject=new PolyLine(Double.valueOf(geoloc.getLat()),Double.valueOf(geoloc.getLng()));
//			PolyLine nearestPolyLine=getNearestPolyLine(polylines,geolocObject);
			
			return truckDeviated(polylines,geolocObject);
			
		}
		
		
		
		return false;
	}

	private boolean truckDeviated(List<PolyLine> polylines, PolyLine geolocObject) {
		double tolerance = 5000; // meters
		
		boolean exceededTolerance = false;    

		for (PolyLine l : polylines) {
		    if (!isLocationOnPath(l, polylines, true, tolerance)) {
		        exceededTolerance = true;
		        break;
		    }
		}

		if (exceededTolerance) 
		    return true;
		
		return false;
	}

	private boolean isLocationOnPath(PolyLine l, List<PolyLine> polylines, boolean b, double tolerance) {
		if(true)
			return true;
		return false;
	}

	private PolyLine getNearestPolyLine(List<PolyLine> polylines,PolyLine geolocObject) {
		PolyLine nearestPolyLine= new PolyLine();
		
		return null;
	}

	private List<PolyLine> convetToList(String polyLine) {
		List<PolyLine> polylines=new ArrayList<>();
		polyLine=polyLine.replace("{{", "");
		polyLine=polyLine.replace("}}", "");
		polyLine=polyLine.replace("{", "");
		polyLine=polyLine.replace("}", "");
		
		String[] lines=polyLine.split(",");
		for (int i=0;i<lines.length;i+=2) {
			polylines.add(new PolyLine(Double.valueOf(lines[i]),Double.valueOf(lines[i+1])));
		}
		return polylines;
	}

}
