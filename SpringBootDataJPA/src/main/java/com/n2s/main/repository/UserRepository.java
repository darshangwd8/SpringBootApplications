package com.n2s.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.n2s.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
