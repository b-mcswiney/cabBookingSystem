package com.example.cabBookingFront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.example.cabBookingFront.model.Booking;

@Controller
public class BookingController {
	
	@Autowired
	private RestTemplate template;
	@Value("${spring.datasource.url}")
	String url;
	
	@GetMapping("/list")
	public String getAllBookings(Model model) {
		ResponseEntity<List<Booking>> response = null;
		
		response = template.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Booking>>() {
		});
		
		List<Booking> bookings = response.getBody();
		
		int total = 0;
		
		for(Booking b : bookings) {
			total = total + (b.getDistance() * 5);
		}
		
		model.addAttribute("bookings",bookings);
		model.addAttribute("price", total);
		
		return "bookingslist";
	}
	
	@GetMapping("/add")
	public String getBookingForm() {
		return "bookingform";
	}
	
	@PostMapping("/add")
	public String addNewBooking(@ModelAttribute Booking newBooking) {
		Booking bookingSaved = template.postForObject(url, newBooking, Booking.class);
		System.out.println(bookingSaved);
		return "redirect:/list";
	}
}
