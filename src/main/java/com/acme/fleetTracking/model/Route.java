package com.acme.fleetTracking.model;

public class Route {
	
	private String deviceId ;
	private String pickupLoc ;
	private String pickupLat ;
	private String pickupLong ;
	private String deliveryLoc ;
	private String deliveryLat ;
	private String deliveryLong ;
	private String polyline ;
	
	
	
	public Route() {
		super();
	}
	public Route(String deviceId, String pickupLoc, String pickupLat, String pickupLong, String deliveryLoc,
			String deliveryLat, String deliveryLong, String polyline) {
		super();
		this.deviceId = deviceId;
		this.pickupLoc = pickupLoc;
		this.pickupLat = pickupLat;
		this.pickupLong = pickupLong;
		this.deliveryLoc = deliveryLoc;
		this.deliveryLat = deliveryLat;
		this.deliveryLong = deliveryLong;
		this.polyline = polyline;
	}
	@Override
	public String toString() {
		return "Route [deviceId=" + deviceId + ", pickupLoc=" + pickupLoc + ", pickupLat=" + pickupLat + ", pickupLong="
				+ pickupLong + ", deliveryLoc=" + deliveryLoc + ", deliveryLat=" + deliveryLat + ", deliveryLong="
				+ deliveryLong + ", polyline=" + polyline + "]";
	}
	public final String getDeviceId() {
		return deviceId;
	}
	public final void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public final String getPickupLoc() {
		return pickupLoc;
	}
	public final void setPickupLoc(String pickupLoc) {
		this.pickupLoc = pickupLoc;
	}
	public final String getPickupLat() {
		return pickupLat;
	}
	public final void setPickupLat(String pickupLat) {
		this.pickupLat = pickupLat;
	}
	public final String getPickupLong() {
		return pickupLong;
	}
	public final void setPickupLong(String pickupLong) {
		this.pickupLong = pickupLong;
	}
	public final String getDeliveryLoc() {
		return deliveryLoc;
	}
	public final void setDeliveryLoc(String deliveryLoc) {
		this.deliveryLoc = deliveryLoc;
	}
	public final String getDeliveryLat() {
		return deliveryLat;
	}
	public final void setDeliveryLat(String deliveryLat) {
		this.deliveryLat = deliveryLat;
	}
	public final String getDeliveryLong() {
		return deliveryLong;
	}
	public final void setDeliveryLong(String deliveryLong) {
		this.deliveryLong = deliveryLong;
	}
	public final String getPolyline() {
		return polyline;
	}
	public final void setPolyline(String polyline) {
		this.polyline = polyline;
	}
	
	

}
