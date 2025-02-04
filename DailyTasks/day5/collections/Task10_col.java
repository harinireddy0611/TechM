package day5.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task10_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to shuffle elements in an array list.
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Collections.shuffle(al);
		System.out.println("elemnts of  array are");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
