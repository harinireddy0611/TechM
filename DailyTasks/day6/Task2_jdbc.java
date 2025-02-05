package day6;

import java.sql.*;
import java.util.Scanner;

public class Task2_jdbc{

	public static void main(String[] args) throws SQLException,Exception{
		// TODO Auto-generated method stub
		//Update the row of a table dynamically using Scanner class.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Harini@0611");
		
	
		PreparedStatement st = con.prepareStatement("update Employee set Empname= ?, branch=? , salary=? where empid =?");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id that you want to change");
		int empId=sc.nextInt();
		
		System.out.println("Enter the Employee Name");
		String empName=sc.next();
		
		System.out.println("Enter the Employee branch");
		String branch=sc.next();
		
		System.out.println("Enter the Employee Salary");
		int empSal= sc.nextInt();
		
		
		st.setString(1, empName);
		st.setString(2, branch);
		st.setInt(3, empSal);
		st.setInt(4,empId);
		
		st.executeUpdate();
		st.close();
		
		
		Statement st1=con.createStatement();
		ResultSet rs = st1.executeQuery("select * from employee");
	    
		while(rs.next()){
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getInt(4));
		
		System.out.println();
		}
		st1.close();
		con.close();
		sc.close();

	}

}
