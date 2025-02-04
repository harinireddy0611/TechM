package day5.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to search for an element in an array list.
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter colors to stop enter stop ");
		while(true) {
			String x = sc.next();
			if(x.equals("stop"))
				{
				break;
				}
			else {
				al.add(x);
			}
			
		}
		System.out.println("Enter color to search: ");
		String y=sc.next();
		System.out.println("\nthe element is at index");
		System.out.println(al.indexOf(y));
		sc.close();
	}

}
