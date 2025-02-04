package day2;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double x=Math.sqrt(n);
		if(x*x==n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
