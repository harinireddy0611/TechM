package day2;
import java.util.Scanner;


public class Employee {
 int empId;
 String empName;
 double sal;
 
 public void getEmployeeDetails() {
	 System.out.println("Id: "+empId);
	 System.out.println("name: "+empName);
	 System.out.println("salary: "+sal);
 }
 
 public void setEmployeeDetails(int empId, String empName,double sal) {
	 this.empId=empId;
	 this.empName=empName;
	 this.sal=sal;
 }
 public double getLoanEligiblity() {
	 double grant=0;
	 System.out.println("enter experience: ");
	 Scanner sc=new Scanner(System.in);
	 int exp=sc.nextInt();
	 if (exp>5) {
		 if(sal==600000)grant=200000;
		 else if(sal>=1000000)grant=500000;
		 else if(sal>=1500000)grant=700000;
	 }
	 sc.close();
	 return grant;
	 
 }
}
