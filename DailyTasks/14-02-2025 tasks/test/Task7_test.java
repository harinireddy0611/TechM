package junittasks;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class Task7_test {
	Task7_junit task = new Task7_junit();

    @Test
    public void testMultiplyPositiveNumbers() {
        int result = task.multiply(5, 3);
        assertEquals("Multiplication failed for positive numbers (5 * 3)", 14, result);
    }

    @Test
    public void testMultiplyWithZero() {
        int result = task.multiply(5, 0);
       assertEquals("Multiplication failed when multiplying by zero (5 * 0)", 0, result);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        int result = task.multiply(-4, 2);
        assertEquals("Multiplication failed for negative numbers (-4 * 2)", -8, result);
    }
}
