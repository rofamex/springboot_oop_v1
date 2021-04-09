package com.rofamex.springboot_oop_v1.encapsulation_test.hospital;

public class Doctor {
	
	String name;
	Integer age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer getAge() {
		return age;
	}

	private void setAge(Integer age) {
		this.age = age;
	}
}
