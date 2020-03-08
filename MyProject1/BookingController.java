package com.myproject;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/booking")
public class BookingController {

	@Autowired
	private BookingServiceImpl bookingServiceImpl;
	
	@GetMapping(path = {"/welcome"})
	public String welcome()
	{
		return "Welcome";
	}
	
	@PostMapping
	public Booking create(@RequestBody Booking booking)
	{
		return bookingServiceImpl.create(booking);
	}
	
	@PutMapping(path = {"/update/{subjectId}"})
	public Booking update(@PathVariable("subjectId") Long subjectId, @RequestBody Booking booking)
	{
		return  bookingServiceImpl.update(booking);
	}
	
	@DeleteMapping(path = {"/{subjectId}"})
	public Booking Delete(@PathVariable Long subjectId)
	{
		return bookingServiceImpl.delete(subjectId);
	}
	
	@GetMapping
	public HashMap<Long, Booking> findAll()
	{
		return bookingServiceImpl.findAll();
	}
	
}
