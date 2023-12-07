package com.chappy.sauna.aufguss.domain.reservations.service;

import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;

public interface ReservationRepository {
  void insert(Reservation reservation);

  String delete(String id);
}
