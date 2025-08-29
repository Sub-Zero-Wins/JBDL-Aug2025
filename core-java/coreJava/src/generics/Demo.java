package generics;

class Data <T>
{
	private T x ;

	
	public Data(T x) {
		super();
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
}

public class Demo
{
	public static void main(String[] args) 
	{
		Data<Integer> d1= new Data<Integer>(100);
		System.out.println(d1.getX());
		System.out.println(d1);
		
		Data<String> d2= new Data<String>("Syed");
		System.out.println(d2.getX());
		System.out.println(d2);
		
	}

}
