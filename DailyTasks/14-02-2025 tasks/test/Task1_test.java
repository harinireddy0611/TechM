package junittasks;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task1_test {
	@Test
    public void testAddNumbers() {  
		Task1_junit task1 = new Task1_junit();
        
        assertEquals(8, task1.sum(3, 5));
    }
}
