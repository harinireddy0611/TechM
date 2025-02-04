package day5.collections;

import java.util.ArrayList;


public class Task9_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to copy one array list into another.
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ArrayList<Integer> alcopy=new ArrayList<Integer>();
		alcopy.addAll(al);
		System.out.println("elemnts of copy array are");
		for(int i=0;i<alcopy.size();i++) {
			System.out.println(alcopy.get(i));
		}
	}

}
