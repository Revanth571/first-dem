package com.myproject;

import java.util.List;

public interface BookingService {

	Booking create(Booking booking);
	
	Booking delete(Long subjectId);
	
	List<Booking> findAll();
	
	Booking update(Booking booking);
	
	Booking findBysubjectid(Long subjectid);
}
