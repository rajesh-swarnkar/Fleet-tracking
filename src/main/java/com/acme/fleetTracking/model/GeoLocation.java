package com.acme.fleetTracking.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class GeoLocation {
	private String deviceId;
	private String lat;
	private String lng;
	private LocalDateTime time;
	
	
	
	public GeoLocation() {
		super();
	}



	public GeoLocation(String deviceId, String lat, String lng, LocalDateTime time) {
		super();
		this.deviceId = deviceId;
		this.lat = lat;
		this.lng = lng;
		this.time = time;
	}



	public final String getDeviceId() {
		return deviceId;
	}



	public final void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}



	public final String getLat() {
		return lat;
	}



	public final void setLat(String lat) {
		this.lat = lat;
	}



	public final String getLng() {
		return lng;
	}



	public final void setLng(String lng) {
		this.lng = lng;
	}



	public final LocalDateTime getTime() {
		return time;
	}



	public final void setTime(LocalDateTime time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "GeoLocation [deviceId=" + deviceId + ", lat=" + lat + ", lng=" + lng + ", time=" + time + "]";
	}
	
	
	
}
