package com.chappy.sauna.aufguss.domain.events.service;

import java.util.List;
import java.util.Optional;

import com.chappy.sauna.aufguss.domain.events.model.Event;

public interface EventRepository {
  void insert(Event event);

  List<Event> findAll();

  Optional<Integer> getMaxId();

  int update(Event event);

  int delete(int id);
}
