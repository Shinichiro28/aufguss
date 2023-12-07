package com.chappy.sauna.aufguss.domain.reservations.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationDomainService {

  private final ReservationRepository reservationRepository;

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddhhmm");

  public Reservation post(Reservation reservation) {
    var uuid = UUID.randomUUID();
    var now = LocalDateTime.now();
    reservation.setId(now.format(FORMATTER) + "-" + uuid.toString());
    reservation.setTimestamp(now);
    reservationRepository.insert(reservation);
    return reservation;
  }

  public void delete(String id) {
    reservationRepository.delete(id);
  }
}
