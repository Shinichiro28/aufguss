package com.chappy.sauna.aufguss.infrastructure.reservations;

import org.springframework.stereotype.Repository;

import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;
import com.chappy.sauna.aufguss.domain.reservations.service.ReservationRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisReservationRepository implements ReservationRepository {

  private final ReservationMapper reservationMapper;

  @Override
  public void insert(Reservation reservation) {
    reservationMapper.insert(reservation);
  }

  @Override
  public String delete(String id) {
    return reservationMapper.delete(id);
  }
}
