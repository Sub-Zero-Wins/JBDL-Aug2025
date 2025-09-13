package com.example.service;

import org.springframework.stereotype.Service;

import com.example.myAnnotations.MyAnno;

@Service

public class TicketService 
{
	
	public void bookTicket()
	{
		System.out.println("book ticket");
		//throw new RuntimeException();
	}
	
	@MyAnno
	public void printTickets()
	{
		System.out.println("print ticket");
		//throw new RuntimeException();
	}

}
