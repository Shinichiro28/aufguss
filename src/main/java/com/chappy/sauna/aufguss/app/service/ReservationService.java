package com.chappy.sauna.aufguss.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;
import com.chappy.sauna.aufguss.domain.reservations.service.ReservationDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {

  private final ReservationDomainService reservationDomainService;

  public Reservation post(Reservation reservation) {
    var username = "guest";
    reservation.setUsername(username);
    return reservationDomainService.post(reservation);
  }

  public void delete(String id) {
    reservationDomainService.delete(id);
  }
}
