package day2;

import java.util.Scanner;

public class LastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String s="";
		for(int i=0;i<str1.length();i++) {
			if((str1.charAt(i)==' ') && (Character.isAlphabetic(str1.charAt(i-1)))) {
				s=s+str1.charAt(i-1);
			}
		}
			if(Character.isAlphabetic(str1.charAt(str1.length()-1))) {
				s=s+str1.charAt(str1.length()-1);
				
			}
		System.out.println(s);

	}

}
