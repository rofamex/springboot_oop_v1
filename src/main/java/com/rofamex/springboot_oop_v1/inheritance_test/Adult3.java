package com.rofamex.springboot_oop_v1.inheritance_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adult3 extends Customer3 {

	public Adult3(String name, Integer age) {
		super(name, age);
	}

	private static final Logger LOG = LoggerFactory.getLogger(Adult3.class);

	public void companyName(String companyName) {
		LOG.info("Company name is {}.", companyName);
	}

}
