package com.dh.seriesservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body(this.message);
    }
}
