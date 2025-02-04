package day2;

import java.util.Scanner;

public class SmallestVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char min='{';
		for(int i=0;i<str.length();i++) {
			if("aeiou".indexOf(Character.toLowerCase(str.charAt(i)))!=-1) {
				if(str.charAt(i)<min) {
					min=str.charAt(i);
				}
			}
		}
		if(min!='{') {
			System.out.println(min);
		}
		scan.close();

	}

}
