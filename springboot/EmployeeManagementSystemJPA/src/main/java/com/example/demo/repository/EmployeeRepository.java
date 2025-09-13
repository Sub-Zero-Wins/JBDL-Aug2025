package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{
	List<Employee> findByName(String name);


//	@Query("Select e.name,e.age from employee e where salary=?1and age>?2")
//	Employee getEmployee(int salary,int age);
//
//	@Query(value ="Select *  from employee",nativeQuery=true)
//	List<Employee> getAllEmployee();

}
