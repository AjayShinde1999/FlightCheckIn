package com.flightreservationapp.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flightreservationapp.dto.Reservation;
import com.flightreservationapp.dto.ReservationUpdateRequest;

@Component
public class ReservationRestFullClientImpl implements ReservationRestFullClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flight/reservations/" + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flight/reservations/", request, Reservation.class);
		return reservation;
	}

}
