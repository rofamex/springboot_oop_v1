package com.rofamex.springboot_oop_v1.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rofamex.springboot_oop_v1.abstract_test.Customer;
import com.rofamex.springboot_oop_v1.abstract_test.Adult;
import com.rofamex.springboot_oop_v1.abstract_test.Child;

@Component
public class MainRoute {
	private static final Logger LOG = LoggerFactory.getLogger(MainRoute.class);

	public MainRoute() {
		abstractTest();
	}

	private void abstractTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		Customer john = new Adult();
		john.name("John");
		john.age(24);
		john.welcomeMessage();
		
		Customer alice = new Child();
		alice.name("Alice");
		alice.age(9);
		alice.welcomeMessage();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

}
