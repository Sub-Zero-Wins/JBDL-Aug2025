package contructors;

public class Employee 
{
   int id;
   String name;
   String addr;
 
   public Employee(int id , String name,String addr)
   {
	  this.id=id;
	  this.name=name;
	  this.addr=addr;
   }
   
   public Employee( String name,String addr)
   {
	 
	  this.name=name;
	  this.addr=addr;
   }
   
   
   public Employee( String name)
   {
	 
	  this.name=name;
	
   }
   
   
}
