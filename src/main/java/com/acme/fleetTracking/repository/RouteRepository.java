package com.acme.fleetTracking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.fleetTracking.entity.Route;

public interface RouteRepository extends JpaRepository<Route, String> {
	
	public Optional<Route> findById(String id);

}
