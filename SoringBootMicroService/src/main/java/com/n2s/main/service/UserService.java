package com.n2s.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.n2s.main.model.User;

@Service
public class UserService {
	private static final List<User> users = new ArrayList<>();
	{
		users.add(new User(1, "Darshan"));
		users.add(new User(2, "Darshan"));
		users.add(new User(3, "Darshan"));
		users.add(new User(4, "Darshan"));
		users.add(new User(5, "Darshan"));
		users.add(new User(6, "Darshan"));
		users.add(new User(7, "Darshan"));
		users.add(new User(8, "Darshan"));
		
	}
	public List<User> getAllUsers() {
		return users;
		
	}
	public User getUser(final int id) throws Exception{
		return users
				.stream()
				.filter(User -> User.getId() == id)
				.findFirst()
				.orElseThrow(()-> new Exception("Entity not found"));
	}

}
