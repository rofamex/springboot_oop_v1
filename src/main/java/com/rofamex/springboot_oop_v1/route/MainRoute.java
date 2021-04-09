package com.rofamex.springboot_oop_v1.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rofamex.springboot_oop_v1.abstract_test.Adult;
import com.rofamex.springboot_oop_v1.abstract_test.Child;
import com.rofamex.springboot_oop_v1.abstract_test.Customer;
import com.rofamex.springboot_oop_v1.interface_test.Customer2;

@Component
public class MainRoute {
	private static final Logger LOG = LoggerFactory.getLogger(MainRoute.class);

	public MainRoute() {
		interfaceTest();
	}

	private void abstractTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		Customer john = new Adult();
		john.name("John");
		john.age(24);
		john.showForm();
		john.welcomeMessage();

		Customer alice = new Child();
		alice.name("Alice");
		alice.age(9);
		alice.showForm();
		alice.welcomeMessage();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void interfaceTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		Customer2 john = new Customer2();
		john.name("John");
		john.age(24);
		john.showForm();
		john.save();
		john.findByName("John");

		Customer2 alice = new Customer2();
		alice.name("Alice");
		alice.age(9);
		alice.showForm();
		alice.save();
		alice.findByAge(9);

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

}
