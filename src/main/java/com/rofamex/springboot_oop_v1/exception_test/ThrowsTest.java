package com.rofamex.springboot_oop_v1.exception_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThrowsTest {
	private static final Logger LOG = LoggerFactory.getLogger(ThrowsTest.class);

	public void execute() throws Exception {
		int test = division();
	}

	public int division() {
		int result = 0;

		int x = 0;
		int y = 4;

		try {
			result = y / x;
		} catch (Exception e) {
			LOG.info("4/0 is not possible");
		}

		return result;
	}

}
