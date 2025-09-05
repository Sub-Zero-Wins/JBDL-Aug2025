package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component("repo2")
public class EmployeeRepoImpl2 implements EmployeeRepository {

	@Override
	public void greet() {
		System.out.println("greet 2");
		
	}

}
