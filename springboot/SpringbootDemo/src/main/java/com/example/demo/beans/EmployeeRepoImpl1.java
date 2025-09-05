package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component("repo1")
public class EmployeeRepoImpl1 implements EmployeeRepository {

	@Override
	public void greet() {
		System.out.println("greet 1");
		
	}

}
