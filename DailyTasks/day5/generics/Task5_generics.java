package day5.generics;

import java.util.ArrayList;
import java.util.List;

public class Task5_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.
		List <Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		List <Integer> list2=new ArrayList<Integer>();
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		List <Integer> list3=mergelists(list1,list2);
		
		for(int i =0;i<list3.size();i++) {
        	System.out.println(list3.get(i)+" ");
        }
		
List<String> stringList1 = List.of("Apple", "Banana", "Cherry", "Banana", "Date");
List<String> stringList2 = List.of("hello", "all", "how ", "are ", "you");
        
        List <String> revlist2=mergelists(stringList1,stringList2);
        for(int i =0;i<revlist2.size();i++) {
        	System.out.println(revlist2.get(i)+" ");
        }

	}
	public static <T> List<T> mergelists(List<T> list1,List<T> list2) {
		List <T> list3=new ArrayList<T>();
		int n= Math.max(list1.size(), list2.size());
		for(int i=0;i<n;i++) {
			if (i <list1.size()) {
			list3.add(list1.get(i));
			}
			if (i <list2.size()) {
			list3.add(list2.get(i));
			}
		}
		return list3;
		
	}

}
