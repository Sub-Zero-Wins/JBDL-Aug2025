package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.jdbcCrud.EmpServiceImpl;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements ApplicationRunner {

	@Autowired
	EmpServiceImpl service;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		service.addEmployee(new Employee(101,"Syed",29,134342));
		service.addEmployee(new Employee(102,"Saqib",29,134341));
		service.addEmployee(new Employee(103,"Sharukh",22,13414));
	
     System.out.println(service.getAllEmployees());
     System.out.println(service.getEmployee(101));
		
	}

}
