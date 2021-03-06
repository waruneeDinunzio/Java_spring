package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")//many object can be created

public class Customer {
	private int c_id;
	private String c_name;
	
	
//	public Customer(int c_id, String c_name) {
//		super(); //from Object class in spring library
//		this.c_id = c_id;
//		this.c_name = c_name;
//	}
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public void show() {
		System.out.println("Customer object created.");
	}
	
	
	@Autowired
	private Address addr;
	
}
