package com.example.SLM.controller;

import com.example.SLM.DateService.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateController {

    private final DateService dateServicee;

    @Autowired
    public DateController(DateService service) {
        this.dateServicee = service;
    }
    @GetMapping("/time")
    public LocalTime getTime() {
        return dateServicee.getTime();
    }

    @GetMapping("/date")
    public String getDate(@RequestParam(required = false) String format) {
        return dateService.getDate(format);
    }

}
