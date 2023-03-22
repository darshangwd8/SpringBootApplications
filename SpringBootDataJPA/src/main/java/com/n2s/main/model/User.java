package com.n2s.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	private String username,pwd;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private long id;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public long getIdl() {
		return id;
	}
	
	public void setIdl(long id) {
		this.id = id;
	}
	
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	
	public User() {
		super();
	}
	

}
