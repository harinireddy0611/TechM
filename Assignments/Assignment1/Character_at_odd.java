package day2;
import java.util.Scanner;

public class Character_at_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String o="";
		for(int i=1;i<str.length();i=i+2) {
			System.out.print(str.charAt(i));
			o+=str.charAt(i);
		}
		System.out.println("");
		System.out.println(o);
		sc.close();
	}
}
