package com.example.demo.jdbcCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.utility.ResourceNotFoundException;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class EmpServiceImpl implements EmployeeService
{

	@Autowired
	EmployeeRepository repo;


	@Override
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee getEmployee(int empId) throws ResourceNotFoundException {
		
		return repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException("no empp with given id"));
	}

	@Override
	public Employee updateEmployee(Employee updatedEmp) {
		return repo.save(updatedEmp);
	}

	@Override
	public String deleteEmployee(int empId) {
		repo.deleteById(empId);
		return "deleted emp with id "+empId;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return  (List<Employee>) repo.findAll();
}

	@Override
	public List<Employee> search(String name) {
		return repo.findByName(name);
	}




}
