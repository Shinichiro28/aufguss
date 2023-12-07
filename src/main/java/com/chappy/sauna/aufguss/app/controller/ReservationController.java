package com.chappy.sauna.aufguss.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chappy.sauna.aufguss.app.service.ReservationService;
import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events/{eventId}/reservations")
@RequiredArgsConstructor
public class ReservationController {

  private ReservationService reservationService;

  @PostMapping
  public Reservation post(@PathVariable int eventId, @RequestBody Reservation reservation) {
    reservation.setEventId(eventId);
    return reservationService.post(reservation);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") String id) {
    reservationService.delete(id);
  }
}
