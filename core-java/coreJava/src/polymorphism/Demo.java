package polymorphism;

class Parent
{
	public Object m1()
	{
		System.out.println("Parents method");
		return null;
	}
}

class Child extends Parent
{
	@Override
	public  String m1()
	{
		System.out.println("Childs method");
		return null;
	}
}

public class Demo {
	public static void main(String[] args) {
         Child child = new Child();
         child.m1();
	}
}
