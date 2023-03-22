package com.n2s.main.dao;

import java.util.List;

import com.n2s.main.model.Login;

public interface LoginDao {
    
	public void insertUser(Login l);
	
	public List<Login> getAllUser();
	
	public Login getUserById(int id);

}
