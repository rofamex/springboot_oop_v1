package com.rofamex.springboot_oop_v1.interface_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer2 implements CustomerRepository {
	private static final Logger LOG = LoggerFactory.getLogger(Customer2.class);

	Integer id;
	String name;
	Integer age;

	public Customer2() {
		this.id = null;
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

	public void findById(Integer id) {
		LOG.info("Find by id: {}.", id);
	}

	public void save() {
		LOG.info("Successfully Saved");
	}

	public void delete(Integer id) {
		LOG.info("Successfully Deleted");
	}

	public void update(Integer id) {
		LOG.info("Successfully Updated");
	}

	public void findByName(String name) {
		LOG.info("Find by name: {}.", name);
	}

	public void findByAge(Integer age) {
		LOG.info("Find by age: {}.", age);
	}

}
