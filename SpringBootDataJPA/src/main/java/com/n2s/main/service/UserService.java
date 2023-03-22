package com.n2s.main.service;

import com.n2s.main.model.User;

public interface UserService {
	
	User insertUser(User u);
	
	User getAllById(Long id);
	
	Long count();
	

}
