package day2;

import java.util.Scanner;

public class vowels_to_consonents {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=0,v=0;
		for(int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				
			if("aeiou".indexOf(Character.toLowerCase(str.charAt(i)))!=-1) {
				v+=1;
			}
			else {
				c+=1;
			}
			}
		}
		System.out.println(v);
		System.out.println(c);
		sc.close();
	}
	}
