package day6;

import java.sql.*;
import java.util.Scanner;

public class Task3_jdbc {

	public static void main(String[] args) throws Exception,SQLException{
		// TODO Auto-generated method stub
		//Delete the row from the table by using a delete query using Scanner class.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Harini@0611");
		
	
		PreparedStatement st = con.prepareStatement("delete from Employee where empid =?");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id that you want to delete");
		int empId=sc.nextInt();
		st.setInt(1,empId);
		st.executeUpdate();
		
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
