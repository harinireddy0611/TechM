package junittasks;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class Task6_test {
	private final Task6_junit task = new Task6_junit();

	@Test
    public void testDivideValid() {
        assertEquals(5, task.divide(10, 2));
    }

    @Ignore("Skipping because division by zero is not yet handled.")
    @Test
    public void testDivideByZero() {
        task.divide(10, 0); 
    }
}
