package constructorChaining;

class A
{
	A()
	{
		this(10);
		System.out.println("no args");
	}
	A(int x)
	{
		this("syed");
		System.out.println("int args "+x);
	}
	A(String y)
	{
		
		System.out.println("String args "+y);
	}
}

public class ThisMethodDemo 
{
	public static void main(String[] args) 
	{
		A a = new A();
	}

}
