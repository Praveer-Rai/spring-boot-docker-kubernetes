package com.praveer.movieservice.controllers;

import java.util.Collections;
import java.util.List;

import com.praveer.movieservice.entities.Movie;
import com.praveer.movieservice.repository.MovieRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
 
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
 
    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}