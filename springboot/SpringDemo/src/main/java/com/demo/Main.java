package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Employee emp1=context.getBean("emp",Employee.class);
		Employee emp2=context.getBean("emp",Employee.class);
		Employee emp3=context.getBean("emp",Employee.class);
		
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
		System.out.println(System.identityHashCode(emp3));
		
		
	}

}
