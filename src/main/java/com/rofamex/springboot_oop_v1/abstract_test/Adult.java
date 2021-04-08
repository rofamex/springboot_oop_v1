package com.rofamex.springboot_oop_v1.abstract_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adult extends Customer {
	private static final Logger LOG = LoggerFactory.getLogger(Adult.class);

	@Override
	public void welcomeMessage() {
		LOG.info("Welcome, adult!");
	}

}
