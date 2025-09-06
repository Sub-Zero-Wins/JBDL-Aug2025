package com.example.demo.jdbcCrud;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService
{
	public Employee addEmployee(Employee emp);
	public Employee getEmployee(int empId);
	public Employee updateEmployee(Employee updatedEmp);
	public String deleteEmployee(int empId);
	public List<Employee> getAllEmployees();
	
}
