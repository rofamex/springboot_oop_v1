package com.rofamex.springboot_oop_v1.exception_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThrowNewTest {
	private static final Logger LOG = LoggerFactory.getLogger(ThrowNewTest.class);

	public void execute() {
		throw new ArithmeticException("Access denied");
	}

}
