package wrapper;

public class Demo1
{
	public static void main(String[] args) 
	{
		Integer autoBox = 10; // auto/implicit boxing
		Integer expBox = Integer.valueOf(100); // explicit boxing
		
		 int primitive= autoBox.intValue(); //explicit unboxing
		 int x = autoBox; // auto/implicit Unboxing
		
	}

}
