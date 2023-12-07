package com.chappy.sauna.aufguss.domain.events.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chappy.sauna.aufguss.domain.events.model.Event;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventDomainService {

  private final EventRepository eventRepository;

  public Event create(Event event) {
    var currentMaxId = eventRepository.getMaxId();
    var newid = currentMaxId.orElse(0) + 1;
    event.setId(newid);
    eventRepository.insert(event);
    return event;
  }

  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  public Event update(Event event) {
    eventRepository.update(event);
    return event;
  }

  public void delete(int id) {
    eventRepository.delete(id);
  }
}
