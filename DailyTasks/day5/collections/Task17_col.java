package day5.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task17_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert the specified element at the front of a linked list.
		
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("front element to insert:");
		int first=sc.nextInt();
		
		list.addFirst(first);
		Iterator<Integer> itr=list.iterator();
		
		System.out.println("elemnts of linked list are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();
	}

}
