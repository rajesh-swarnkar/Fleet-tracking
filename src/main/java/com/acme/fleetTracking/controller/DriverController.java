package com.acme.fleetTracking.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping(value = "/")
	   public String name() {
		  System.out.println(this.appName+" is running ....");
	      return this.appName+" is running ....";
	   }

}
