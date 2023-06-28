package com.example.SLM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/hallo")
public class HalloController {

    public final DateService dateService;

    @Autowired
    public DateController(DateService service) {
        this.dateService = service;
    }

    @GetMapping("/hi")
    public LocalTime getTime() {
        return LocalTime.now(),
    }

    @GetMapping("/dati")
    public String getDate() {

    }
}
