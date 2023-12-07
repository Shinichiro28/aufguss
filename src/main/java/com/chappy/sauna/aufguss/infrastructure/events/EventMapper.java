package com.chappy.sauna.aufguss.infrastructure.events;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.chappy.sauna.aufguss.domain.events.model.Event;

@Mapper
public interface EventMapper {
  void insert(Event event);

  List<Event> findAll();

  Optional<Integer> getMaxId();

  int update(Event event);

  int delete(int id);
}
