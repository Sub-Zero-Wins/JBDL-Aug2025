package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Employee 
{
	@Id
	private int empid;
	private String name;
	private int age;
	private int salary;
	
	public Employee() {}
	
	public Employee(int empid, String name, int age, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	


}
