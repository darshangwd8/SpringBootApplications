package com.n2s.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean(name={"FirstBean","SecondBean"})
	public UserService getUser() {
		return new UserService();
	}

	public UserConfig() {
		System.out.println("Userconfig object is created");
	}
	

}
