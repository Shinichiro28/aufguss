package com.chappy.sauna.aufguss.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chappy.sauna.aufguss.app.service.EventService;
import com.chappy.sauna.aufguss.domain.events.model.Event;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/events")
public class EventController {

  private final EventService eventService;

  @PostMapping()
  public Event create(@RequestBody Event event) {
    return eventService.create(event);
  }

  @GetMapping()
  public List<Event> findAll() {
    return eventService.findAll();
  }

  @PutMapping("/{id}")
  public Event update(@PathVariable("id") int id, @RequestBody Event event) {
    event.setId(id);
    return eventService.update(event);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") int id) {
    eventService.delete(id);
  }
}
