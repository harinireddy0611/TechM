package day1;

import java.util.Arrays;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program 4: Use ArrayCopyRange() function to demonstrate and example such that you copy the range of values in an array.
		int arr1[]= {10,20,30,40,50};
		int arr2[]= Arrays.copyOfRange(arr1,1,5);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}	
	}

}
