package day5.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to retrieve an element (at a specified index) from a given array list.
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
		System.out.println("enter index to retrieve");
		int i=sc.nextInt();
		System.out.println("color at index is");
		System.out.println(al.get(i));
		sc.close();


	}	

}
