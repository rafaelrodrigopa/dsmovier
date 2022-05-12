package com.praticarafa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticarafa.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	User findByEmail(String email);
	
}
