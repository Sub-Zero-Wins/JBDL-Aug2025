package strings;

public class StringDemo2 {
	
	public static void main(String[] args) 
	{
       String s = "syed";// 1
       String s1 = "Syed"; // 0
       
       String s2 = new String("Saqib"); // 2 (normally 2 objects)
       String s3 = new String("Saqib"); // 1 (Saqib is already in constant pool)
       
       // immutable
       
       s=s.concat(" saqib");// changes will be created in new String object in NCP
       
       System.out.println(s);
       
       s.toLowerCase();// no change so no new object
       
       // mutable
       
       StringBuilder s4 = new StringBuilder("Syed");// 1
       
       s4.append(" Saqib");
       
       System.out.println(s4);
       
       
      

	}
}
