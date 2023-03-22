package com.n2s.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to springBott";
		
	}
	@RequestMapping("/display")
	public String display() {
		return "Display Name";
		
	}
	@RequestMapping("/add/{x}/{y}")
	public String addition(@PathVariable int x, @PathVariable int y) {
		return Integer.toString(x+y);
	}

}
