package day5.collections;

import java.util.LinkedList;

public class Task20_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(30);
		list.add(40);
		System.out.println(list.indexOf(30));
		System.out.println(list.lastIndexOf(30));
		

	}

}
