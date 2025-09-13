package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TicketAspect 
{

	@Pointcut("execution(public * com.example.service.*.*(..))")
	public void p1() {}
	
	@Pointcut("@annotation(com.example.myAnnotations.MyAnno)")
	public void p2() {}


//	@After("p1()")
//	public void sendEmailReport()
//	{
//		System.out.println("email report sent");	
//	}
//
//	@AfterReturning("p1()")
//	public void commitBooking()
//	{
//		System.out.println("tickets booking commited , reciept printed");	
//	}
//
//	@AfterThrowing("p1()")
//	public void rollbackBooking()
//	{
//		System.out.println("payment failed, booking cancelled");	
//	}
//
//	@Before("p1()")
//	public void transactionStart()
//	{
//		System.out.println("transaction started");	
//	}


	@Around("p2()")
	public void around(ProceedingJoinPoint p)
	{
		System.out.println("before advice");

		try {
			p.proceed();// business logic executes
			System.out.println("after returning advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("after throwing advice");
		}

		System.out.println("after advice");
	}



}
