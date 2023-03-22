package com.n2s.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n2s.main.dao.LoginDao;
import com.n2s.main.model.Login;

@Service
public class LoginServiceIMP implements LoginService{
    
	
	@Autowired
	LoginDao ld;
	
	
	@Override
	public void insertUser(Login l) {
		ld.insertUser(l);
		
	}

	@Override
	public void getAllUser() {
		ld.getAllUser();
		
	}

	@Override
	public void getUserById(int id) {
		ld.getUserById(id);
		
	}
	

}
