package com.praticarafa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticarafa.dsmovie.entities.Score;
import com.praticarafa.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {}
