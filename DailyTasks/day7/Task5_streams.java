package day7;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
public class Task5_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
		
		List<String> names = List.of("aaradhya", "abhinav", "megha", "sukeerth", "aadithya", "lakshmi","skanda");

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter to count the names starting with that letter:");
        String startLetter = scan.next().toLowerCase(); 

        
        List<String> filteredNames = names.stream()
                                          .filter(e -> e.toLowerCase().startsWith(startLetter))
                                          .collect(Collectors.toList());

        
        System.out.println("The number of names that start with letter '" + startLetter + "' are: " + filteredNames.size());
        System.out.println("Names: " + filteredNames);
        
        scan.close();
	}

}
