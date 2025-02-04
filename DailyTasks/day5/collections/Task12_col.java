package day5.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Task12_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to iterate through all elements in a linked list.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator<Integer> itr=list.iterator();
		
		System.out.println("elemnts of linked list are");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}

	}

}
