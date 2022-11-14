package com.acme.fleetTracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acme.fleetTracking.service.NotifyService;

@RestController
public class NotifyController {
	
	@Autowired
	NotifyService notifyService;
	
	@GetMapping(value = "/notifyPersonal/{device}")
	public ResponseEntity<String> notify(@PathVariable String deviceId){
		
		//check deviation
		boolean deviation=notifyService.checkDeviation(deviceId);
		String response="";
		if(deviation)
			response="truck with device id : "+deviceId+" has been deviated!";
		else
			response="truck is on time!";
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
