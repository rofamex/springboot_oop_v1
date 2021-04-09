package com.rofamex.springboot_oop_v1.interface_test;

public interface CustomerRepository extends DatabaseFunctions {

	public void findByName(String name);
	public void findByAge(Integer age);

}
