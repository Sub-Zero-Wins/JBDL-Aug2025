package constructorChaining;

//public class Object // inbuilt
//{
//	public Object()
//	{
//		
//	}
//}

class X // extends Object
{
	X(int x)
	{
		//super();
		System.out.println("X constr");
	}
}
class Y extends X
{
	Y()
	{
		super(10);
		System.out.println("Y constr");
	}
}
public class SuperDemo 
{
	public static void main(String[] args) {
		new Y();
	}

}
