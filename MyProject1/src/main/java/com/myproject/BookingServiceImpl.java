package com.myproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired 
	private BookingRepository bookingRepository;
	
	public Booking create(Booking booking) {
		return bookingRepository.save(booking);
	}


	public Booking delete(Long subjectId) {
		Booking booking  = bookingRepository.findBysubjectid(subjectId);
		if(booking != null)
		{
			bookingRepository.delete(booking);
		}
		else
		{
			System.out.println("Booking not found");
		}
		return booking;
	}


	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	public Booking update(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public Booking findBysubjectid(Long subjectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
