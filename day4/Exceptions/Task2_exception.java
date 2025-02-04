package day41.Exceptions;

import java.util.Scanner;

public class Task2_exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		exception1(x);
		
		//the exception is caught inside exception1 so the program does not crash and end of program is always printed.
		System.out.println("end of program");

	}
	public static void exception1(int num){
		try {
			if(num%2==0) {
				throw new Exception("even");
			}
			else {
				System.out.println("this is odd number");
			}
		}
		catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
	}

}