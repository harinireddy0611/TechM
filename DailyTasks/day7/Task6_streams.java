package day7;

import java.util.Comparator;
import java.util.List;

public class Task6_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
		
		List<String> names = List.of("aaradhya", "abhinav", "megha", "sukeerth", "aadithya", "lakshmi","skanda");
        System.out.print("Ascending order sorted: ");
        names.stream().sorted().forEach(e -> System.out.print(e + " "));
        System.out.println(); 
        
        
        System.out.print("Descending order sorted: ");
        names.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();
	}

}
