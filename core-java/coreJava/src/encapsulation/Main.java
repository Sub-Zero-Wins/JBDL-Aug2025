package encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Syed");
		System.out.println(emp1.getId());
		
		System.out.println(emp1);
	}
}
