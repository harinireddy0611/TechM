package day6;

import java.sql.*;
import java.util.Scanner;

public class Task4_jdbc {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
		//
		//Task 4 : Create a menu driven program where the options would be
		//1. Insert a new Row 
		//2. Update a Row
		//3. Delete a Row
		//4. Select the row
		//5. Exit

   //Use PreparedStatement class for all the above tasks.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Harini@0611");
		
		System.out.println("Select and option");
		System.out.println("Menu\n1. Insert a new Row \n 2. Update a Row\n3. Delete a Row\n4. Select the row\n5. Exit");
		
		Scanner sc=new Scanner(System.in);
		int option= sc.nextInt();
		switch(option) {
		case 1: PreparedStatement st = con.prepareStatement("insert into Employee values(?,?,?,?)");
				System.out.println("Enter the Employee Id");
				int empId=sc.nextInt();
		
				System.out.println("Enter the Employee Name");
				String empName=sc.next();
		
				System.out.println("Enter the Employee branch");
				String branch=sc.next();
		
				System.out.println("Enter the Employee Salary");
				int empSal= sc.nextInt();
		
				st.setInt(1,empId);
				st.setString(2, empName);
				st.setString(3, branch);
				st.setInt(4, empSal);
		
				st.executeUpdate();
				break;
				
		case 2:PreparedStatement st1 = con.prepareStatement("update Employee set Empname= ?, branch=? , salary=? where empid =?");
		
				System.out.println("Enter the Employee Id that you want to change");
				int empId1=sc.nextInt();
		
				System.out.println("Enter the Employee Name");
				String empName1=sc.next();
		
				System.out.println("Enter the Employee branch");
				String branch1=sc.next();
		
				System.out.println("Enter the Employee Salary");
				int empSal1= sc.nextInt();
		
		
				st1.setString(1, empName1);
				st1.setString(2, branch1);
				st1.setInt(3, empSal1);
				st1.setInt(4,empId1);
		
				st1.executeUpdate();
				break;
				
		case 3: PreparedStatement st2 = con.prepareStatement("delete from Employee where empid =?");
				System.out.println("Enter the Employee Id that you want to delete");
				int empId2=sc.nextInt();
				st2.setInt(1,empId2);
				st2.executeUpdate();
				break;
				
		case 4: PreparedStatement st3 = con.prepareStatement("Select * from Employee where empid =?");
				System.out.println("Enter the Employee Id that you want to display");
				int empId3=sc.nextInt();
				st3.setInt(1,empId3);
				ResultSet rs=st3.executeQuery();
				while(rs.next()){
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getInt(4));
					
					System.out.println();
					}
				break;
				
		case 5: System.exit(1);
		
		default: System.out.println("Enter Valid option");
		}
		System.out.println("\n\nthe table is ");
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
