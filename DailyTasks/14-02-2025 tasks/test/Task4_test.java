package junittasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class Task4_test {
	
	    private final int x;
	    private final int y;
	    private final int e;
	    private final Task4_junit task4 = new Task4_junit();

	    public Task4_test(int x,int y, int e) {
	        this.x = x;
	        this.y = y;
	        this.e = e;
	    }

	    @Parameterized.Parameters
	    public static Collection<Object[]> testData() {
	        return Arrays.asList(new Object[][]{
	        	{ 2, 3, 6 },
	            { -2, 3, -6 },
	            { 0, 5, 0 },
	            { 4, 4, 16 },
	            { 7, 2, 14 }
	        });
	    }

	    @Test
	    public void testSquare() {
	        assertEquals(e, task4.multiply(x,y));
	    }
	    
}
