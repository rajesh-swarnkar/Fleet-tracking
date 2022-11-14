package com.acme.fleetTracking.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.fleetTracking.kafka.GeoLocationProducerService;
import com.acme.fleetTracking.model.GeoLocation;
import com.acme.fleetTracking.repository.GeoLocationRepositroy;

@Service
public class GeoLocationServiceImpl implements GeoLocationService{
	
	@Autowired
	GeoLocationRepositroy geoLocationRepository;
	
	@Autowired
	private GeoLocationProducerService producer;
	
	@Autowired
	ModelMapper modelMapper;
	
	public Object addGeoLoaction(GeoLocation geoLoaction) {
		com.acme.fleetTracking.entity.GeoLocation geoLocationEntity=modelMapper.map(geoLoaction, com.acme.fleetTracking.entity.GeoLocation.class);
		producer.sendMessage(geoLoaction.toString());
		return this.geoLocationRepository.save(geoLocationEntity);
		
	}
	
	

}

