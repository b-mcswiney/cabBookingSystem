package com.proj.cabBooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.cabBooking.entity.Booking;


public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
