package com.example.cabBookingFront.model;


public class Booking {

	int id;
	String startLocation;
	String endLocation;
	int distance;
	String cabType;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(String startLocation, String endLocation, int distance, String cabType) {
		super();
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distance = distance;
		this.cabType = cabType;
	}
	
	public Booking(int id, String startLocation, String endLocation, int distance, String cabType) {
		super();
		this.id = id;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distance = distance;
		this.cabType = cabType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", startLocation=" + startLocation + ", endLocation=" + endLocation + ", distance="
				+ distance + ", cabType=" + cabType + "]";
	}
}
