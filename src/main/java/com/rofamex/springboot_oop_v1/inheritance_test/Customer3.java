package com.rofamex.springboot_oop_v1.inheritance_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer3 {
	private static final Logger LOG = LoggerFactory.getLogger(Customer3.class);

	String name;
	Integer age;
	
	public Customer3(String name, Integer age) {
		this.name = name;
		this.age = age;
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

}
