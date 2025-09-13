package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.service.TicketService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopDemoApplication implements ApplicationRunner {

	@Autowired
	TicketService service;
	
	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	  service.bookTicket();
	  service.printTickets();
		
	}
	

}
