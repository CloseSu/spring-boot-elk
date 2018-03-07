package com.demo.moniter.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/")
    public String getTestString() {
        log.info("Test looooooooooooooooooooooooooooooooooog");
	return "this is my first log";
    }
}
