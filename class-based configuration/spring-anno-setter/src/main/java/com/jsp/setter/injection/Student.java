package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	private String email;
	
	
	public int getId() {
		return id;
	}

	@Value(value = "1234")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	@Value(value = "XYZ")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Value(value = "xyz@mail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
