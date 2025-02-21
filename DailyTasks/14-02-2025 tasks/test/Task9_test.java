package junittasks;
import org.junit.Test;

import static org.junit.Assert.assertSame;


public class Task9_test {
	//Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.

	 @Test
	    public void testSingletonInstance() {
	        Task9_junit instance1 = Task9_junit.getInstance();
	        Task9_junit instance2 = Task9_junit.getInstance();

	       assertSame("Both instances should be the same", instance1, instance2);
	    }
}
