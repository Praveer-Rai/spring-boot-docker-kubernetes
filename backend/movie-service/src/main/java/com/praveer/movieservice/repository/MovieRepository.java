package com.praveer.movieservice.repository;

import com.praveer.movieservice.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}