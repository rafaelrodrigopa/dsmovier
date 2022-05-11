package com.praticarafa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticarafa.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
