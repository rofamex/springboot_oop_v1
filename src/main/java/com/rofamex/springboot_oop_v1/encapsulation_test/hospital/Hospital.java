package com.rofamex.springboot_oop_v1.encapsulation_test.hospital;

import com.rofamex.springboot_oop_v1.encapsulation_test.school.Professor;

public class Hospital {

	public Hospital() {

		Doctor doctor = new Doctor();
		doctor.setName("Alan");
//		doctor.setAge(25);
//		can't set his age because it is a private method
//		it is accessible to the class only.
		
		Patient patient = new Patient();
		patient.setName("Zark");
		patient.setAge(55);
//		I can set patient age because it is a public method,
//		it is accessible to everything
		
		Professor professor = new Professor();
		professor.setName("Zark");
//		professor.setAge(55);
//		I can't set professor age because it is a protected method,
//		it is accessible to class, package, and subclasses
		
	}

}
