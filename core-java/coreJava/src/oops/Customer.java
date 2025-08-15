package oops;

public class Customer 
{
    int customerId;      // non static varables / instance variable / object variable // default values by jvm
    String customerName; // non static variable
    static String bankAccount = "1234"; // static variable/class Variable // default values by jvm
    static int custIdCounter=0;
    
    public void getCustomerDetails()// non static methods
    {
    	System.out.println(this.customerId+" "+this.customerName);
    }
    
    public static int getNextCustId() // static methods
    {
    	return custIdCounter+1;
    }
    
    public static int totalCustomers() // static methods
    {
    	return custIdCounter;
    }
    
}
