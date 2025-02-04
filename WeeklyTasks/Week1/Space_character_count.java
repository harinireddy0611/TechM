package day2;

import java.util.Scanner;

public class Space_character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int c1=0;
		int c2=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				c1+=1;
			}
			else if(Character.isDigit(str.charAt(i))) {
				
			}
			else {
				c2+=1;
			}
		}
		System.out.println(" No of spaces : "+c1 +" and characters : "+c2);
		
		
	}

}
