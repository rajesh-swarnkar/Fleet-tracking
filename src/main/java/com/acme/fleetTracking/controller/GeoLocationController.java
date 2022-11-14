package com.acme.fleetTracking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.fleetTracking.model.GeoLocation;
import com.acme.fleetTracking.service.GeoLocationService;

@RestController
public class GeoLocationController {

	@Autowired
	GeoLocationService geoLocationService;
	
	Logger logger = LoggerFactory.getLogger(GeoLocationController.class);
	
	@PostMapping(value = "/addgeolocation")
	public ResponseEntity<Object> addGeoLocation(
			@RequestBody GeoLocation geoLoaction) {
		logger.info("this is value: "+geoLoaction.toString());
		return new ResponseEntity<Object>( this.geoLocationService.addGeoLoaction(geoLoaction),HttpStatus.OK);
	}

}
