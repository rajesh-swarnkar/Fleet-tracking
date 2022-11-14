package com.acme.fleetTracking.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocationId implements Serializable{
	
	@Id
	private String deviceId;
	@Id
	private LocalDateTime time;
	

}
