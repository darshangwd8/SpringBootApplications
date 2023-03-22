package com.n2s.demo;

import org.springframework.stereotype.Component;

@Component("abc")
public class UserId {
	private String empid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "UserId [empid=" + empid + "]";
	}
	
	public void printid() {
		System.out.println("printing Id");
		
	}

	public UserId() {
		System.out.println("Object is created in Userid");
	}
	

}
