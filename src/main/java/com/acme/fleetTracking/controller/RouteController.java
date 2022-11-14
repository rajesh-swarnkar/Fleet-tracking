package com.acme.fleetTracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.fleetTracking.model.Route;
import com.acme.fleetTracking.service.RouteService;

@RestController
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	@PostMapping(value = "/addroute")
	public ResponseEntity<Route> addRoute(@RequestBody Route route){
		routeService.addRoute(route);
		return new ResponseEntity<Route>(route, HttpStatus.OK);
	}

}
