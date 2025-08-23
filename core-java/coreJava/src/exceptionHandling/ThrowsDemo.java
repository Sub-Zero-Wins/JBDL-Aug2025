package exceptionHandling;

import java.io.IOException;

public class ThrowsDemo 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("main start");
		m1();
		System.out.println("main end");

	}

	private static void m1() throws IOException {
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");

	}

	private static void m2() throws IOException {

		System.out.println("m2 start");
		
			throw new IOException("checked exception");
		
		
		
	}



}
