package day5.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task2_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a Java program to iterate through all elements in an array list.
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
		Iterator<String> itr=al.iterator();
		System.out.println("colors are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();

	}

}
