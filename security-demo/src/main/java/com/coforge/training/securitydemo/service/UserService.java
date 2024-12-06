package com.coforge.training.securitydemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.coforge.training.securitydemo.model.User;
import com.coforge.training.securitydemo.repository.userRepository;

/**
*Author        : Manthri.Sujitha
*Date          : 2 Dec 2024
*Time          : 5:28:48 pm
*Project Name  : security-demo
*/

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private final userRepository userRepo;
	
	@Autowired
	private final PasswordEncoder passwordEncoder;
		
	//Dependency Injection (DI) using constructor for final method
	public UserService(userRepository userRepo, PasswordEncoder passwordEncoder) {
		super();
		this.userRepo = userRepo;
		this.passwordEncoder = passwordEncoder;
	}
	
	public void saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepo.save(user); //save() pre-defined method in JPA repo
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
        Optional<User> user=userRepo.findByUsername(username);
		return user.orElseThrow(() -> new UsernameNotFoundException("User Not found"));
	}


}
