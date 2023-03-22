package com.n2s.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  class SpringBootActuatorLogApplication implements ApplicationRunner{

	public static final Logger Log = LogManager.getLogger(SpringBootActuatorLogApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorLogApplication.class, args);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Log.info("Starting ,my logging herre");
		Log.warn("Hey Check ypour value");
		Log.error("Exception occured");
		Log.debug("Debug printing");
		
	}

}
