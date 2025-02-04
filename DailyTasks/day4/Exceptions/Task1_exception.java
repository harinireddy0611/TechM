package day41.Exceptions;

import java.util.Scanner;

public class Task1_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int z=x/y;
			System.out.print(z);
		}
		catch(Exception e) {
			System.err.print(e);
		}

	}

}
