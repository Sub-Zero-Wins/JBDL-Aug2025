package oops;

public class CustMain 
{
	public static void main(String[] args) // local variables
	{
		// accesing static variables and methods
		
		Customer.custIdCounter=1;
		System.out.println(Customer.custIdCounter);
		
		System.out.println(Customer.totalCustomers());
		System.out.println(Customer.getNextCustId());
		
		
		// accessing non static variables and methods
		
		Customer cust = new Customer(); // local variable
		
		System.out.println(cust.customerId);
		System.out.println(cust.customerName);
		
		cust.getCustomerDetails();
		 
	}

}
