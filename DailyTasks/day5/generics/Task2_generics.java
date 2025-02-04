package day5.generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();

        List<Integer> numbers = readList(n);

        int[] sums = sumOddEven(numbers);

        System.out.println("Sum of even numbers: " + sums[0]);
        System.out.println("Sum of odd numbers: " + sums[1]);

        sc.close();
    }

    public static <T extends Number> List<T> readList(int n) {
        Scanner sc = new Scanner(System.in);
        List<T> list = new ArrayList<>();

        System.out.println("Enter elements of the list: ");
        for (int i = 0; i < n; i++) {
            list.add((T) Integer.valueOf(sc.nextInt()));
        }
        sc.close();
        return list;
    }

    public static <T extends Number> int[] sumOddEven(List<T> list) {
        int evenSum = 0;
        int oddSum = 0;

        for (T num : list) {
            int value = num.intValue(); // Convert to int
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        return new int[]{evenSum, oddSum};
	}
	
}


