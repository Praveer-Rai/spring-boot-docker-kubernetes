package com.praveer.movieservice.controllers;

import java.util.Collections;
import java.util.List;

import com.praveer.movieservice.entities.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
 
    @GetMapping("/movies")
    public List getMovies() {
        return Collections.EMPTY_LIST;
    }
 
    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie) {
        return null;
    }
}