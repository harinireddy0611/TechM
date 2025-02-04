package day5.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task6_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove the third element from an array list.
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
		System.out.println("\nremoved color is");
		System.out.println(al.remove(2));
		Iterator<String> itr=al.iterator();
		System.out.println("\ncolors are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();
	}

}
