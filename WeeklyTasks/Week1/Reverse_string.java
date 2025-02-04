package day2;
import java.util.Scanner;

public class Reverse_string {
public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		//method 1 using string builder
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sb.reverse();
		System.out.println((sb.toString()).toLowerCase());
		

		//method 2 using char array
		char[] ch=sc.nextLine().toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--) {
			str+=ch[i];
		}
		System.out.println(str.toLowerCase());
		
		//method 3 using string 
		String str2="";
		String str1=sc.nextLine();
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		System.out.println(str2.toLowerCase());
		sc.close();
		
}
}
