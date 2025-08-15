package constructorChaining;

class M
{
	int a=10;
	
	public void m1()
	{
		System.out.println("m1 M");
	}
}
class N extends M
{
    int a=20;
	
	public void m1()
	{
		System.out.println("m1 N");
	}
	
	public void print() 
	{
		System.out.println(a);
		m1();
		System.out.println(super.a);
		super.m1();
		
	}
}
public class SuperKWDemo {

	 public static void main(String[] args) {
		new N().print();
	}
}
