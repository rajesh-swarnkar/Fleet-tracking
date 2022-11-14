package com.acme.fleetTracking.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.acme.fleetTracking.entity.GeoLocation;

public interface GeoLocationRepositroy extends JpaRepository<GeoLocation, String>{
	 
	public Optional<GeoLocation> findByDeviceIdAndTime(String id,LocalDateTime time);

	@Query(value = "select * from geo_location where device_id = ?1 order by time desc limit 1",nativeQuery = true)
	public List<GeoLocation> findByDeviceId(String deviceId);
}

