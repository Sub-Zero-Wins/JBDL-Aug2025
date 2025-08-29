package methodReferencing;

@FunctionalInterface
interface Calc
{
	int add(int a,int b);
}

class Calculator
{
	public static int sum(int a,int b)
	{
		System.out.println("addition");
		return a+b;
	}
}

public class Demo1 
{
	public static void main(String[] args)
	{
//		Calculator c = new Calculator();
//		c.sum(1,2);
		
		Calc calc=Calculator::sum;
		
		calc.add(1,2);
		
	}

}
