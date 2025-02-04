package day1;

import java.util.Arrays;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program 3: Demonstrate with an example with the difference between equals() vs deepEquals() method?
				int arr1[]= {10,20,30,40,50};
				int arr2[]= {10,20,30,40,50};
				Object[] intarr1= {arr1};
				Object[] intarr2= {arr2};
				System.out.println(Arrays.equals(arr1,arr2)); //true
				System.out.println(Arrays.deepEquals(intarr1,intarr2)); //true
				System.out.println(Arrays.equals(intarr1,intarr2)); //false

	}

}
