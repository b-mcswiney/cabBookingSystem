package com.proj.cabBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.cabBooking.entity.Booking;
import com.proj.cabBooking.repo.BookingRepo;

import jakarta.persistence.EntityExistsException;

@Service
public class BookingService {
	@Autowired
	private BookingRepo repo;
	
	public List<Booking> getAllBookings() {
		return repo.findAll();
	}
	
	public Booking addNewBooking(Booking newBooking) {
		if(repo.existsById(newBooking.getId())) {
			throw new EntityExistsException("Cannot add "+newBooking.getId()+" already exists");
		}
		return repo.save(newBooking);
	}
	
//	public Booking getBookingById(int id) {
//		return repo.getById(id);
//	}
}
