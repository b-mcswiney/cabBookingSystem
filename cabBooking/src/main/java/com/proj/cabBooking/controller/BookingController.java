package com.proj.cabBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.cabBooking.entity.Booking;
import com.proj.cabBooking.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService service;
	
	@GetMapping
	public List<Booking> getAllBookings(Model model) {
		return service.getAllBookings();
	}
	
	@PostMapping
	public Booking addNewBooking(@RequestBody Booking newBooking) {
		System.out.println(newBooking);
		
		return service.addNewBooking(newBooking);
	}
	
//	@GetMapping("/{id}")
//	public Booking getBookingById(@PathVariable int id) {
//		return service.getBookingById(id);
//	}
}
