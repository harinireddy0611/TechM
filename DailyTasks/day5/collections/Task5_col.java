package day5.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to update an array element by the given element.
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
		System.out.println("enter index to update");
		int i=sc.nextInt();
		System.out.println("Enter color to add update element: ");
		String y=sc.next();
		al.set(i, y);;
		sc.close();
		System.out.println(al.get(i));

	}

}
