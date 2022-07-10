package com.dh.seriesservice.domain;

import com.dh.seriesservice.model.Serie;
import com.dh.seriesservice.repository.SerieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private SerieRepository repository;

    public DataLoader (SerieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        repository.save(new Serie(1L, "scream", "terror", 7));
        repository.save(new Serie(2L, "Game Of thrones", "action", 8));
        repository.save(new Serie(3L, "friends", "comedy",12 ));
        repository.save(new Serie(4L, "how I met your mother", "comedy",9 ));
        repository.save(new Serie(5L, "shadow hunters", "action",6 ));

    }
}
