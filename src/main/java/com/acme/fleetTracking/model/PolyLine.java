package com.acme.fleetTracking.model;

public class PolyLine {
	
	private Double latitude;
	private Double longitude;
	
	
	public PolyLine() {
		super();
	}


	public PolyLine(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public  Double getLatitude() {
		return latitude;
	}


	public  void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public  Double getLongitude() {
		return longitude;
	}


	public  void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
