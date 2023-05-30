package com.flightreservationapp.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.flightreservationapp.dto.Reservation;
import com.flightreservationapp.dto.ReservationUpdateRequest;

public interface ReservationRestFullClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}
