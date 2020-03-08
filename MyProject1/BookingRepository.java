package com.myproject;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface BookingRepository extends Repository<Booking, Long> {
	
	void delete(Booking booking);
	
	Booking save(Booking booking);
	
	List<Booking> findAll();
	
	Booking findBysubjectid(Long subjectid);
}
