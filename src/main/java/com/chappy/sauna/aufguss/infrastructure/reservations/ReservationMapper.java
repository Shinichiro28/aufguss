package com.chappy.sauna.aufguss.infrastructure.reservations;

import org.apache.ibatis.annotations.Mapper;

import com.chappy.sauna.aufguss.domain.reservations.model.Reservation;

@Mapper
public interface ReservationMapper {
  void insert(Reservation reservation);

  String delete(String id);
}
