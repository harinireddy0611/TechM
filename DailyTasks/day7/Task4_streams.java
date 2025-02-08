package day7;
import java.util.List;
public class Task4_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove all duplicate elements from a list using streams.
		
		List<Integer> numbers = List.of(10,33,40,33,10,40,35,54,54);
        System.out.println("Before removing duplicates: " + numbers);

        System.out.println();
        System.out.print("After removing duplicates: ");
        numbers.stream().distinct().forEach(e -> System.out.print(e + " "));
	}

}
