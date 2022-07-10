package com.example.catalogservice.queue;

import com.dh.seriesservice.model.Serie;
import com.example.catalogservice.api.client.MovieServiceClient;
import com.example.catalogservice.domain.model.Movie;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieSender {

//	@Autowired
//	MovieServiceClient serviceClient;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private Queue movieQueue;

	@Autowired
	private Queue serieQueue;

	public void send(Movie movie) {
		this.rabbitTemplate.convertAndSend(this.movieQueue.getName(), movie/*serviceClient.saveMovie(movie)*/);
	}

	public void send(Serie serie) {
		this.rabbitTemplate.convertAndSend(this.serieQueue.getName(), serie/*serviceClient.saveMovie(movie)*/);
	}
}
