package com.proj.cabBooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(length=150)
	String startLocation;
	
	@Column(length=150)
	String endLocation;
	
	int distance;
	
	@Column(length=150)
	String cabType;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int id, String startLocation, String endLocation, int distance, String cabType) {
		super();
		this.id = id;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distance = distance;
		this.cabType = cabType;
	}

	public Booking(String startLocation, String endLocation, int distance, String cabType) {
		super();
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
