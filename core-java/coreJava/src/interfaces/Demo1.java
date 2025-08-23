package interfaces;

interface Itr1
{
	public void m1();
}

interface Itr2 
{
	public void m2();	
}

interface Itr3 extends Itr1,Itr2
{
	
}

class A implements Itr1,Itr2,Itr3{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
class B implements Itr1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

class C extends B implements Itr1,Itr2
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo1
{
	public static void main(String[] args) 
	{
		
		
	}

}
