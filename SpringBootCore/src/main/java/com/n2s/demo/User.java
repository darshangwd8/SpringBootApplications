package com.n2s.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component //<<---scans all components if we want only specific class, see below
//@ComponentScan(basePackages =  "com.n2s.demo" )
//@ComponentScan(basePackages =  {"com.n2s.demo","com.n2s.main1"} )
//@Scope(value="prototype")//by default singleton is the scope of bean
public class User {
	private String name;
	private int age;
	
	
	@Autowired  // search by type
	@Qualifier("abc")//if more class are present it is referred by alias name
	private UserId uid;
	
	public String getName() {
		return name;
	}
	public User() {
		System.out.println("User Object created");		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	public UserId getUid() {
		return uid;
	}
	public void setUid(UserId uid) {
		this.uid = uid;
	}
	public void showid() {
		uid.printid();
		
	}

}
