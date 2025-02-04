package day5.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
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
		
		System.out.println("colors are");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		sc.close();
		

	}

}
