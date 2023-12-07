package com.chappy.sauna.aufguss.domain.events.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Event {
  private int id;
  private String name;
  private LocalDateTime dateTime;
  private String address;
  private int capacity;
  private int booked;
  private boolean reservationFlg;
  private boolean soldoutFlg;
  private String free;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
