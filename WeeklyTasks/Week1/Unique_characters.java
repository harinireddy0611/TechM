package day2;
import java.util.Scanner;

public class Unique_characters {
	
	public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 String s="";
		 for(int i=0;i<str.length();i++) {
			 if(!s.contains(str.subSequence(i, i+1))) {
				 s+=str.subSequence(i, i+1);
			 }
		 }
		 System.out.println(s);
		 sc.close();
		 
	}
}
