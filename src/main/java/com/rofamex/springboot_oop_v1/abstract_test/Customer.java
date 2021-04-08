package com.rofamex.springboot_oop_v1.abstract_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Customer {
	private static final Logger LOG = LoggerFactory.getLogger(Customer.class);

	String name;
	Integer age;

	public void name(String name) {
		this.name = name;
		LOG.info("Your name is {}.", name);
	}

	public void age(Integer age) {
		this.age = age;
		LOG.info("You have {} years old.", age);
	}

	public abstract void welcomeMessage();

}
