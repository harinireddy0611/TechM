package junittasks;

public class Task2_junit {
	//Write a Java test case to verify that a specific exception is thrown when a method is called with invalid input.
	public void validate(int num) {
		if(num<0) {
			throw new IllegalArgumentException("Number must be non-negative");
		}
	}
}
