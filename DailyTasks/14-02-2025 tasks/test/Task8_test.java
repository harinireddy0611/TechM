package junittasks;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task8_test {
//Write a Java program to explore strategies for testing private methods in a class.
	Task8_junit task = new Task8_junit();

    @Test
    public void testGetSquare() {
       int result = task.getSquare(4);
       assertEquals("Square calculation failed!", 16, result);
    }
}
