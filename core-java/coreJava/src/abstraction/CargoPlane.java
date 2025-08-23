package abstraction;

public class CargoPlane implements Plane{

	@Override
	public void takeOff() {
		System.out.println("cargo plane taking off on long runway");
		
	}

	@Override
	public void land() {
		System.out.println("cargo plane landing on long runway");
		
	}

	
	public void carryGoods() 
	{
		System.out.println("carry goods");
		
	}
}
