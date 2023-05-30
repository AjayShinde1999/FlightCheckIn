package com.flightreservationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservationapp.dto.Reservation;
import com.flightreservationapp.dto.ReservationUpdateRequest;
import com.flightreservationapp.integration.ReservationRestFullClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestFullClient reservationClient;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id,ModelMap modelMap) {
		Reservation reservation = reservationClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("id") Long id,@RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		reservationClient.updateReservation(request);
		return "confirmReservation";
	}

}
