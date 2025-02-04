package day5.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to insert an element into the array list at the first position.
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
		System.out.println("Enter color to add first element: ");
		String y=sc.next();
		al.add(0,y);;
		sc.close();
	}

}
