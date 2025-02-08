package day7;
import java.util.List;
public class Task1_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java program to calculate the average of a list of integers using streams.
		List<Integer> list = List.of(12, 34, 35, 3, 72, 60, 36, 5, 109,1);
        
        int sum = list.stream()
                      .mapToInt(num -> num) 
                      .sum();
      
        int count = list.size();
        double average = (double) sum / count;
        
        System.out.println("The average of the numbers in the list " + list);
        System.out.printf("%.2f \n", average);
	}

}
