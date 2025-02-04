package day5.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task18_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert the specified element at the end of a linked list.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("end element to insert:");
		int last=sc.nextInt();
		
		list.addLast(last);
		Iterator<Integer> itr=list.iterator();
		
		System.out.println("elements of linked list are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();

	}

}
