package day5.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task16_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert elements into the linked list at the first and last positions.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("first element and last element to insert:");
		int first=sc.nextInt();
		int last=sc.nextInt();
		list.addFirst(first);
		list.addLast(last);
		
		Iterator<Integer> itr=list.iterator();
		
		System.out.println("elemnts of linked list are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();

	}

}
