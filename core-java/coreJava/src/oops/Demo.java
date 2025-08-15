package oops;

public class Demo 
{
	int x =10;       // non static variable/Object/instance Variable 
	static int y=20; // static variable/class variable (VIP)
	
	
	public void m1(int a) // non static method
	{
		int b; // local variables cannot be used without initializing/ jvm doesnt give default values like for static and non static
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
	//	System.out.println(b);
	}
	
	public static void m2() // static method
	{
	//	System.out.println(x); //non static variables cannot be directly accessed inside static bodies
		System.out.println(new Demo().x); // can only access by object creation
		System.out.println(y);
	//	System.out.println(a); //   they are local to m1 method and can only be accessed inside m1 method
	//	System.out.println(b); //
	}

}
