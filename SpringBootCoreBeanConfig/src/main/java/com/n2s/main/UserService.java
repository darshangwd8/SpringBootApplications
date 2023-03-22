package com.n2s.main;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	private static List<User> l = new ArrayList<>();
	
	static {
		l.add(new User(1, "Darshan"));
		l.add(new User(2, "Alice"));
		l.add(new User(3, "Bob"));
	}
	public List<User> getuserlist() {
		return l;
	}
	public UserService() {
		System.out.println("userService object created");
	}
	

}
