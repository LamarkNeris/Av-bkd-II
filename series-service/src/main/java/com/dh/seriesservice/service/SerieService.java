package com.dh.seriesservice.service;

import com.dh.seriesservice.model.Serie;
import com.dh.seriesservice.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    SerieRepository repository;

    public List<Serie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public Serie save(Serie serie) {
        return repository.save(serie);
    }
}
