package com.chappy.sauna.aufguss.domain.reservations.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Reservation {
  private String id;
  private int eventId;
  private String text;
  private String username;
  private LocalDateTime timestamp;
}
