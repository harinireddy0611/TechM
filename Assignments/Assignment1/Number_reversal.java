package day2;

import java.util.Scanner;

public class Number_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rev1=0;
		while(n>0) {
			int digit=n%10;
			rev1=rev1*10+digit;
			n/=10;
		}
		System.out.println(rev1);

	}

}
