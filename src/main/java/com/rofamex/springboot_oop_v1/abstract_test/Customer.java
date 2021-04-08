package com.rofamex.springboot_oop_v1.abstract_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Customer {
	private static final Logger LOG = LoggerFactory.getLogger(Customer.class);

	String name;
	Integer age;
	
	public Customer() {
		this.name = "Someone";
		this.age = 0;
	}

	public void name(String name) {
		this.name = name;
	}

	public void age(Integer age) {
		this.age = age;
	}
	
	public void showForm() {
		LOG.info("Your name is {}.", name);
		LOG.info("You have {} years old.", age);
	}

	public abstract void welcomeMessage();

}
