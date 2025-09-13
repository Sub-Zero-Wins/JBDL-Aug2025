package com.example.demo.jdbcCrud;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.utility.ResourceNotFoundException;

public interface EmployeeService
{
	public Employee addEmployee(Employee emp);
	public Employee getEmployee(int empId) throws ResourceNotFoundException;
	public Employee updateEmployee(Employee updatedEmp);
	public String deleteEmployee(int empId);
	public List<Employee> getAllEmployees();
	 List<Employee> search(String name);
	
	
}
