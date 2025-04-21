package com.n2s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  // combination of @Configuration,@Controller and @EnableAutoConfiguration
public class SpringCoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringCoreApplication.class, args);
//		System.out.println("My demo Spring Boot Project");
		ConfigurableApplicationContext ct = SpringApplication.run(SpringCoreApplication.class, args);
	        User u1 = (User)ct.getBean(User.class);
//              User u2 = (User)ct.getBean(User.class);
	        u1.showid();
	}
}
