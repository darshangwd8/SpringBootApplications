package com.n2s.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.n2s.main.model.User;
import com.n2s.main.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@GetMapping("/allusers")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUsers(){
		return us.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	@ResponseStatus(HttpStatus.OK)
	public User getUser(@PathVariable(value="id") final int id) throws Exception{
		return us.getUser(id);
	}	
}
