package com.chappy.sauna.aufguss.app.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chappy.sauna.aufguss.domain.hello.model.Hello;

@RestController
@RequestMapping()
public class HelloController {
  @GetMapping("/hello")
  public Hello hello(@RequestParam("name") Optional<String> name) {
    String resName = name.orElse("world!");
    return new Hello("Hello, " + resName);
  }
}
