package com.dh.seriesservice.controller;

import com.dh.seriesservice.model.Serie;
import com.dh.seriesservice.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
public class SerieController {

    @Autowired
    SerieService service;

    @GetMapping("/{genre}")
    ResponseEntity<List<Serie>> getMovieByGenre(@PathVariable String genre) {
        return ResponseEntity.ok().body(service.findByGenre(genre));
    }

    @PostMapping("/save")
    ResponseEntity<Serie> saveMovie(@RequestBody Serie serie) {

        return ResponseEntity.ok().body(service.save(serie));
    }
}
