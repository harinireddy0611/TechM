package day7;

import java.util.List;
public class Task7_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to find the maximum and minimum values in a list of integers using streams.
		
		List<Integer> numbers = List.of(10,2,3,4,5,6,7,8,9,0);

        int maxValue = numbers.stream().max((a, b) -> a - b).get();
        int minValue = numbers.stream().min((a, b) -> a - b).get();
        
        System.out.println("The maximum of the List is: " + maxValue);
        System.out.println("The minimum of the List is: " + minValue);
	}

}
