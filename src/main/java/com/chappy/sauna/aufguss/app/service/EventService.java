package com.chappy.sauna.aufguss.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chappy.sauna.aufguss.domain.events.model.Event;
import com.chappy.sauna.aufguss.domain.events.service.EventDomainService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class EventService {

  private final EventDomainService eventDomainService;

  public Event create(Event event) {
    return eventDomainService.create(event);
  }

  public List<Event> findAll() {
    return eventDomainService.findAll();
  }

  public Event update(Event event) {
    return eventDomainService.update(event);
  }

  public void delete(int id) {
    eventDomainService.delete(id);
  }
}