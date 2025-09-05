package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService 
{
	
	@Autowired
	@Qualifier("repo1")
	EmployeeRepository repo;
	
	
	
	
	//@Autowired
//	public EmployeeService(EmployeeRepository repo) {
//		super();
//		this.repo = repo;
//	}
//	
//
//	public EmployeeRepository getRepo() {
//		return repo;
//	}
//
//	@Autowired
//	
//	public void setRepo(EmployeeRepository repo) {
//		this.repo = repo;
//	}
//
//	public void greet()
//	{
//		repo.greet();
//	}

}
