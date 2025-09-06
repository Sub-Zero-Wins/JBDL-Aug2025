package com.example.demo.jdbcCrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;

class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setAge(rs.getInt(3));
		emp.setSalary(rs.getInt(4));
		return emp;
	}
}

@Component
public class EmpServiceImpl implements EmployeeService
{
	
	@Autowired
	JdbcTemplate template;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		
		return  (Employee) template.queryForObject("Select * from employee where empid="+empId,new EmployeeRowMapper());
		
	}

	@Override
	public Employee updateEmployee(Employee updatedEmp) {
		// TODO Auto-generated method stub
		return null;
				}

	@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return  template.query("Select * from employee",new BeanPropertyRowMapper(Employee.class));
	}
	
	
	

}
