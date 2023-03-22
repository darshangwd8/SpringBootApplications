package com.n2s.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.n2s.main.model.User;
import com.n2s.main.service.UserService;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	private static UserService us;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	    User u = new User("username","password");
	    us.insertUser(u);
	    System.out.println("Sucessgully inserted");
	    
	}
    @Autowired(required = false)
	public SpringBootDataJpaApplication(UserService us) {
		super();
		this.us = us;
	}
    
}
