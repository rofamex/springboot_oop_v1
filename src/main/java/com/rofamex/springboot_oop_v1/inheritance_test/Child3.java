package com.rofamex.springboot_oop_v1.inheritance_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Child3 extends Customer3 {

	public Child3(String name, Integer age) {
		super(name, age);
	}

	private static final Logger LOG = LoggerFactory.getLogger(Child3.class);

	public void schoolName(String schoolName) {
		LOG.info("Company name is {}.", schoolName);
	}

}
