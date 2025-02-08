package day7;
import java.util.List;
public class Task3_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		
		List<Integer> numbers = List.of(10, 20, 30, 65, 47, 19, 34, 11, 54, 23);

        
        int evensum = numbers.stream()
                             .filter(e -> e % 2 == 0)
                             .mapToInt(Integer::intValue)
                             .sum();

        int oddsum = numbers.stream()
                            .filter(e -> e % 2 != 0)
                            .mapToInt(Integer::intValue)
                            .sum();

       
        System.out.println("Sum of even numbers in list: " + evensum);
        System.out.println("Sum of odd numbers in list: " + oddsum);
	}

}
