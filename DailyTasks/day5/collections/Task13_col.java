package day5.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Task13_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to iterate through all elements in a linked list starting at the specified position.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("element index to iterate from :");
		int i=sc.nextInt();
		
		System.out.println("elements of array from "+i+"th index are");
		
		for(int j=i;j<list.size();j++) 
		{
			System.out.println(list.get(j));
		}
		sc.close();
	}

}
