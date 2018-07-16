package com.gurhan.springrestsecuritysample.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gurhan.springrestsecuritysample.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

}

