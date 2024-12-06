package com.coforge.training.securitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Spring Boot REST API using version 3.2.2, integrated with Spring Security 6.0, MySQLDB, and 
 * featuring user authentication, securing endpoints, login-logout functionality, 
 * and password encoding.
 * 
 * User Registration: Allowing new users to register with username, password, and role.
 * User Authentication: Validating user credentials and ensuring secure access to endpoints.
 * Password Encoding: Storing passwords securely using BCryptEncode.
 * MySQLDB Integration: Persisting user data in MySQLDB.
 */

@SpringBootApplication
public class SecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

}
