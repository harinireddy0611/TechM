package day5.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Task11_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to append the specified element to the end of a linked list.
		LinkedList <Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter last element in linked list:");
		list.addLast(sc.nextInt());
		sc.close();
		System.out.println("elemnts of linked list are");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
