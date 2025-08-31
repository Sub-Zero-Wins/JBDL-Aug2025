package jodaTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Demo
{
	public static void main(String[] args) 
	{
		System.out.println(new Date());
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
	
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate myBdate=LocalDate.of(1996, 04, 19);
		
		LocalDateTime  myBdateTime=LocalDateTime.of(myBdate, lt);
		System.out.println(myBdateTime);
		
		
		ZoneId id=ZoneId.of("America/Chicago");
		ZonedDateTime zdt = ZonedDateTime.now(id);
		System.out.println(zdt);
		
		Period p=Period.between(ld, myBdate);
		System.out.println(p);
		
		
		
		
		
		
	}

}
