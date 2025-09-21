package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.jdbcCrud.EmployeeService;
import com.example.demo.utility.ResourceNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("user/employee")
public class EmployeeUserController 
{
	@Autowired
	EmployeeService service;

	@GetMapping("/getEmp/{empId}")
	public ResponseEntity getEmployee(@PathVariable("empId") int empId) throws ResourceNotFoundException {
		Employee employee=null;				
			employee=service.getEmployee(empId);
				return new ResponseEntity(employee,HttpStatus.OK);
				
	}
	@GetMapping("/allEmp")
	public List<Employee> getAllEmployees() {
		return  (List<Employee>) service.getAllEmployees();
	}
	
	@GetMapping("/search")
	public List<Employee> getAllEmployees(@RequestParam("name") String name) {
		return service.search(name);
	}

}
