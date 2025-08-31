package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo 
{
	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		
		Statement stmt=conn.createStatement();
		
		PreparedStatement stmt1=conn.prepareStatement("SELECT * FROM employee where age > ? and salary < ?");
		stmt1.setInt(1, 29);
		stmt1.setInt(2, 40000);
		
		
		
		
		
		ResultSet rs=stmt1.executeQuery(); //stmt.executeQuery("SELECT * FROM employee where empid ="+101);
		
		System.err.println("eid"+" | "+"ename"+" | "+"eage"+" | "+"esal"+"  | ");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+"   | "+rs.getInt(3)+"   | "+rs.getInt(4)+" | ");
		}
		
		
		
	}

}
