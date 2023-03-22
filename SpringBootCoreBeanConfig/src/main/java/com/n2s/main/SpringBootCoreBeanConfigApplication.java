package com.n2s.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreBeanConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = SpringApplication.run(SpringBootCoreBeanConfigApplication.class, args);
	    
		
		//UserService us = (UserService) ct.getBean(UserService.class);
	    
		UserService us = (UserService) ct.getBean("FirstBean");
		
		System.out.println(us.getuserlist());
	}
}
