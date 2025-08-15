package contructors;

public class Demo
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(1,"Syed","Blr");
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.addr);
		
		Employee emp2 = new Employee(2,"Rushda","AP");
		
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.addr);
		
		Employee emp3 = new Employee("Rush","AC");
		System.out.println(emp3.name);
		System.out.println(emp3.addr);
		
		Employee emp4 = new Employee("Ru");
		System.out.println(emp4.name);
	
		
	}

}
