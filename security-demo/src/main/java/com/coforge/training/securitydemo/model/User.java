package com.coforge.training.securitydemo.model;

import java.lang.reflect.GenericArrayType;
import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
*Author        : Manthri.Sujitha
*Date          : 2 Dec 2024
*Time          : 5:07:21 pm
*Project Name  : security-demo
*/


/*
 * UserDetails is a interface that represents a user in the security context. 
 * It contains information such as username, password, and roles, which are 
 * used to authenticate and authorize users in a web application. 
 * Implementations of the UserDetails interface, such as User, 
 * provide methods for retrieving and setting this information. 
 * Spring Security uses instances of UserDetails as the primary building block for 
 * its security model, allowing for flexible and customizable authentication and 
 * authorization.
 */
@Entity
@Data
public class User implements UserDetails {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
		private Integer id;
		@NotEmpty
		private String username;    
		@NotEmpty
		private String password;  
		@NotEmpty
		private String role;
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return Collections.singleton(new SimpleGrantedAuthority(role));
		}
}
