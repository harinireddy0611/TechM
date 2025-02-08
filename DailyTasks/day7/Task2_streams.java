package day7;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
		
		List<String> list = List.of("telangana", "Karnataka", "AssAm", "Tripura", "delhi");
        List<String> upperCaseList = list.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        
        System.out.println("\nAfter Converting to UpperCase");
        upperCaseList.forEach(e -> System.out.print(e + " "));
        System.out.println();

        
        List<String> lowerCaseList = list.stream()
                                         .map(String::toLowerCase)
                                         .collect(Collectors.toList());

        System.out.println("\nAfter Converting to LowerCase");
        lowerCaseList.forEach(e -> System.out.print(e + " "));
        System.out.println();
	}

}
