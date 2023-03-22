package com.n2s.main.model;

public class Login {
	private String uname;
	private String pwd;
	private int id;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pwd=" + pwd + ", id=" + id + "]";
	}
	

}
