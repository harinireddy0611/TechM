package day5.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task19_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert some elements at the specified position into a linked list.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements :");
		int n=sc.nextInt();
		for(int j=0;j<n;j++) {
			
		System.out.println("element index to insert at and also element:");
		
		int i=sc.nextInt();
		int num=sc.nextInt();
		
		list.add(i,num);
		}
		Iterator<Integer> itr=list.iterator();
		
		System.out.println("elemnts of linked list are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		sc.close();

	}

}
