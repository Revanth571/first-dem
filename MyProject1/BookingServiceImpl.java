package com.myproject;

import java.util.HashMap;
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


	public HashMap<Long, Booking> findAll() {
		HashMap<Long, Booking> hashBooking = new HashMap<Long,Booking>();
		@SuppressWarnings("unchecked")
		List<Booking> listBookings = (List<Booking>) bookingRepository.findAll();
		listBookings.forEach(booking -> 
		    hashBooking.put(booking.getSubjectid(),booking)
		);
//		hashBooking.put(listBookings., listBookings);
//		return bookingRepository.findAll();
		return hashBooking;
		
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
