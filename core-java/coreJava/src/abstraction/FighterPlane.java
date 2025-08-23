package abstraction;

public class FighterPlane implements Plane {

	@Override
	public void takeOff() {
		System.out.println("fighterplane taking off on short runway");
		
	}

	@Override
	public void land() {
		System.out.println("fighterplane landing on short runway");
			
		
	}
	
	public void carryWeapons()
	{
		System.out.println("carrying weapon ");
	}

	
}
