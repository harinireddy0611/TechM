package day6;
import java.sql.*;

public class EmployeeDetails {

	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Harini@0611");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from Employee");
		
	
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
