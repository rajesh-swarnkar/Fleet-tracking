package com.acme.fleetTracking.service;

import org.springframework.stereotype.Service;

@Service
public interface NotifyService {

	boolean checkDeviation(String deviceId);
	

}
