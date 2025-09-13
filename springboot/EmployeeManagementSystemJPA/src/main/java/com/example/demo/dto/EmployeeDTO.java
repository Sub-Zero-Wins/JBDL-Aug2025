package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO 
{
	
	@Pattern(regexp = "^INFY\\d{6}$")
	String id;
	@Email(message = "Name must be valid email format")
	private String name;	
	@Min(value=18 , message =" age cannot be below 18")
	@Max(value=65, message="age cannot be greater that 65")
	private int age ;
	private int salary;
}
