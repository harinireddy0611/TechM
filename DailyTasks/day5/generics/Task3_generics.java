package day5.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a generic method that takes a list of any type and a target element.
		//It returns the index of the first occurrence of the target element in the list. 
		//Return -1 if the target element cannot be found.
		
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target:");
		int num=sc.nextInt();
		System.out.println(firstoccindex(list,num));
		
		List<String> stringList = List.of("Apple", "Banana", "Cherry", "Banana", "Date");
        String target = "Banana";
        System.out.println(firstoccindex(stringList, target));
        
        List<String> stringList1 = List.of("Apple", "Banana", "Cherry", "Banana", "Date");
        String target1 = "hwygwe";
        System.out.println(firstoccindex(stringList1, target1));
		
		sc.close();
		
	}
	public static <T> int firstoccindex(List<T> list,T target) {
		int index=list.indexOf(target);
		return index;
		
	}

}
