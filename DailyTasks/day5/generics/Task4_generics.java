package day5.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.
		List <Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		List <Integer> revlist1=reverselist(list);
		
		for(int i =0;i<revlist1.size();i++) {
        	System.out.println(revlist1.get(i)+" ");
        }
		
		
		List<String> stringList = List.of("Apple", "Banana", "Cherry", "Banana", "Date");
        
        List <String> revlist2=reverselist(stringList);
        for(int i =0;i<revlist2.size();i++) {
        	System.out.println(revlist2.get(i)+" ");
        }
        
        
        List<String> stringList1 = List.of("Apple", "Banana", "Cherry", "Banana", "Date");
        
        List <String> revlist3=reverselist(stringList1);
        for(int i =0;i<revlist3.size();i++) {
        	System.out.println(revlist3.get(i)+" ");
        }

	}
	public static <T> List<T> reverselist(List<T> list) {
		List<T> mList = new ArrayList<>(list);
        Collections.reverse(mList);
        return mList;
		
	}

}
