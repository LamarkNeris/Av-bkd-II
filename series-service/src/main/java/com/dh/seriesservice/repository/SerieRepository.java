package com.dh.seriesservice.repository;

import com.dh.seriesservice.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    @Query("SELECT s FROM Serie m WHERE m.genre = ?1")
    List<Serie> findByGenre(String genre);
}
