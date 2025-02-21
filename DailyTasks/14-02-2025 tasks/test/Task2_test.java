package junittasks;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task2_test {
	@Test
	public void testvaidate() {
	Task2_junit task2=new Task2_junit();
	
	try {
        task2.validate(-1);
        fail("Expected IllegalArgumentException was not thrown");
    } catch (IllegalArgumentException e) {
        assertEquals("Number must be non-negative", e.getMessage());
    }
	}
}
