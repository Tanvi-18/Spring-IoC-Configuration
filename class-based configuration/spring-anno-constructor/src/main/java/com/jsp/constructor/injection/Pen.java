package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {

	private int id;
	private String name;
	private String color;
	
	
	public Pen (@Value(value = "102") int id, @Value(value = "ABC")String name, @Value(value = "Black") String color) {
		this.id= id;
		this.name= name;
		this.color=color;
	}
	
	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(color);
	}
	
}
