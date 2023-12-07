package com.chappy.sauna.aufguss.infrastructure.events;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.chappy.sauna.aufguss.domain.events.model.Event;
import com.chappy.sauna.aufguss.domain.events.service.EventRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisEventRepository implements EventRepository {

  private final EventMapper eventMapper;

  @Override
  public void insert(Event event) {
    eventMapper.insert(event);
  }

  @Override
  public List<Event> findAll() {
    return eventMapper.findAll();
  }

  @Override
  public Optional<Integer> getMaxId() {
    return eventMapper.getMaxId();
  }

  @Override
  public int update(Event event) {
    return eventMapper.update(event);
  }

  @Override
  public int delete(int id) {
    return eventMapper.delete(id);
  }
}
