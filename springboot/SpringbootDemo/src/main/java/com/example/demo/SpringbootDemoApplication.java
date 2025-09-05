package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.demo.beans.EmployeeRepository;
import com.example.demo.beans.EmployeeService;

@SpringBootApplication // @Configuration + @EnableAutoConfiguration + @ComponentScan
public class SpringbootDemoApplication implements ApplicationRunner {
	
  public static Logger log= LoggerFactory.getLogger(SpringbootDemoApplication.class);
  
 
//  @Autowired
//  public  EmployeeService serv;
//  
  @Autowired
  @Qualifier("repo2")
  public  EmployeeRepository repo;
  
  @Autowired
  RestTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	         log.info("Hello world");
	        
	       //  serv.greet();
	         
	         repo.greet();
	}

}
