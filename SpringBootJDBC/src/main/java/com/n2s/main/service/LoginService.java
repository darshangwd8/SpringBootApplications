package com.n2s.main.service;

import com.n2s.main.model.Login;

public interface LoginService {
	
	public void insertUser(Login l);
	
	public void getAllUser();
	
	public void getUserById(int id);
}
