package com.rofamex.springboot_oop_v1.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rofamex.springboot_oop_v1.abstract_test.Adult;
import com.rofamex.springboot_oop_v1.abstract_test.Child;
import com.rofamex.springboot_oop_v1.abstract_test.Customer;
import com.rofamex.springboot_oop_v1.collections_test.DequeTest;
import com.rofamex.springboot_oop_v1.collections_test.ListTest;
import com.rofamex.springboot_oop_v1.collections_test.MapTest;
import com.rofamex.springboot_oop_v1.collections_test.SetTest;
import com.rofamex.springboot_oop_v1.exception_test.ThrowNewTest;
import com.rofamex.springboot_oop_v1.exception_test.ThrowsTest;
import com.rofamex.springboot_oop_v1.exception_test.TryCatchFinallyTest;
import com.rofamex.springboot_oop_v1.inheritance_test.Adult3;
import com.rofamex.springboot_oop_v1.inheritance_test.Child3;
import com.rofamex.springboot_oop_v1.interface_test.Customer2;

@Component
public class MainRoute {
	private static final Logger LOG = LoggerFactory.getLogger(MainRoute.class);

	public MainRoute() {
//		abstractTest();
//		interfaceTest();
//		inheritanceTest();
//		tryCatchFinallyTest();
//		throwNewTest();
//		throwsTest();
//		setTest();
//		listTest();
//		dequeTest();
//		mapTest();
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

	private void inheritanceTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		Adult3 john = new Adult3("John", 24);
		john.showForm();
		john.companyName("Adidas");

		Child3 alice = new Child3("Alice", 9);
		alice.showForm();
		alice.schoolName("Toronto School");

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void tryCatchFinallyTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		TryCatchFinallyTest tryCatchFinallyTest = new TryCatchFinallyTest();
		tryCatchFinallyTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void throwNewTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		ThrowNewTest throwNewTest = new ThrowNewTest();
		throwNewTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void throwsTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		ThrowsTest throwsTest = new ThrowsTest();
		try {
			throwsTest.execute();
		} catch (Exception e) {
			LOG.info(e.getMessage());
		}

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void setTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		SetTest setTest = new SetTest();
		setTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void listTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		ListTest listTest = new ListTest();
		listTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private void dequeTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		DequeTest dequeTest = new DequeTest();
		dequeTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}
	
	private void mapTest() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		MapTest mapTest = new MapTest();
		mapTest.execute();

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}
	
	

}
