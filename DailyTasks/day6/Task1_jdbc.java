package day6;
import java.sql.*;
import java.util.Scanner;
public class Task1_jdbc {

	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
		// Recursively insert multiple row/s into the table.
		 //Hint :: Use PreparedStatement
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Harini@0611");
		
		PreparedStatement st = con.prepareStatement("insert into Employee values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of Employees you want to enter");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
		
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
		}
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
