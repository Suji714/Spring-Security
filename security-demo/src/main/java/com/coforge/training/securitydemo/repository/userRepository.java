package com.coforge.training.securitydemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.securitydemo.model.User;

/**
*Author        : Manthri.Sujitha
*Date          : 2 Dec 2024
*Time          : 5:23:42 pm
*Project Name  : security-demo
*/
public interface userRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);
}
