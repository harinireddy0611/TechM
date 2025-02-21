package junittasks;

public class Task3_junit {
	//Write a Java test case that implements a JUnit test with setup and 
	//teardown methods to prepare and clean up resources for multiple test cases.
	
	    public void initialize() {
	        System.out.println("Resource initialized");
	    }

	    public void cleanup() {
	        System.out.println("Resource cleaned up");
	    }

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

}
