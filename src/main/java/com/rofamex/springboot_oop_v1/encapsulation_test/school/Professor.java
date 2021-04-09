package com.rofamex.springboot_oop_v1.encapsulation_test.school;

public class Professor {

	String name;
	Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Integer getAge() {
		return age;
	}

	protected void setAge(Integer age) {
		this.age = age;
	}

}
