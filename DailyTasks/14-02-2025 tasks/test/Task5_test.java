package junittasks;

import org.junit.Test;

public class Task5_test {
	// Write a Java test case that fails if a method takes longer than a specified time to execute.
	private Task5_junit task=new Task5_junit();
	
	@Test(timeout = 600) 
    public void testMethod() {
        task.longRunningMethod(); 
    }
	
}
