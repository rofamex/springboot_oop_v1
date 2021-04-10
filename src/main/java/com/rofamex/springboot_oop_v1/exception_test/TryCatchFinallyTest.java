package com.rofamex.springboot_oop_v1.exception_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TryCatchFinallyTest {
	private static final Logger LOG = LoggerFactory.getLogger(TryCatchFinallyTest.class);

	public void execute() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			LOG.info("Trying to show numbers");
			LOG.info("numbers: {}", myNumbers[10]);
		} catch (Exception e) {
			LOG.info("Something went wrong.");
		} finally {
			LOG.info("The 'try catch' is finished.");
		}
	}

}
