package hasADemo;

public class HasADemo 
{
	public static void main(String[] args)
	{
		Address addr = new Address(56788,"Hyderabad","Charminar rd");
		
		Employee emp = new Employee(1,"Rushda",addr);// constr DI
		
		System.out.println(emp);
		
		System.out.println(emp.getAddr().getCity());
		
		Employee emp1 = new Employee();
		
		emp1.setId(1);
		emp1.setName("syed");
		emp1.setAddr(addr);// setter DI
		
		System.out.println(emp1);
		
		
		
	}

}
