package com.jsp.employee.setterinjection;

public class Employee {
//	int id;
//	String name;
//	String email;
	
	private int id;
	private String name;
	private String email;
	
	
	public Employee() {
		System.out.println("Employee object created");
	}

	// NSM
	
	public void printEmployeeDetails() {
		System.out.println("ID of the Employee " +id);
		System.out.println("Name of the Employee " + name);
		System.out.println("Email od the Employee " + email);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
