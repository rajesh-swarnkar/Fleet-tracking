package com.acme.fleetTracking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.fleetTracking.model.Route;
import com.acme.fleetTracking.repository.RouteRepository;
@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public com.acme.fleetTracking.entity.Route addRoute(Route route) {
		
		com.acme.fleetTracking.entity.Route routeEntity=modelMapper.map(route, com.acme.fleetTracking.entity.Route.class);
		com.acme.fleetTracking.entity.Route result= routeRepository.save(routeEntity);
	
		return result;
	}

}
