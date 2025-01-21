package com.proj.cabBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proj.cabBooking.entity.Booking;
import com.proj.cabBooking.repo.BookingRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CabBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplication.class, args);
	}
	
	
	@Autowired
	BookingRepo repo;

	@PostConstruct
	public void initialize() {
		Booking b1 = new Booking("My house", "Your house", 12, "1");
		repo.save(b1);
	}
}
