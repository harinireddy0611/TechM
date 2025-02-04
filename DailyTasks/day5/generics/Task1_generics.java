package day5.generics;

import java.util.Arrays;

public class Task1_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
		Integer[] arr1= {10,20,30,40,50};
		Integer[] arr2= {10,20,30,40,50};
		
		System.out.println(checkarray(arr1,arr2));
		
		Integer[] arr3= {10,40,30,40,50};
		Integer[] arr4= {10,50,30,40,50};
		
		System.out.println(checkarray(arr3,arr4));
		
		String[] arr5= {"hi","hello","everyone"};
		String[] arr6= {"hi","hello","everyone"};
		
		System.out.println(checkarray(arr5,arr6));
		

	}
	public static <T> String checkarray(T[] arr1,T[] arr2) {
		if(Arrays.equals(arr1, arr2)) {
			return  "equals";
		}
		else {
			return  "not equals";
		}
		
	}

}

