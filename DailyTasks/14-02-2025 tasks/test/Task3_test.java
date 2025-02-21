package junittasks;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;


public class Task3_test {
	
	    private Task3_junit resource;

	    @Before
	    public void setUp() {
	        resource = new Task3_junit();
	        resource.initialize();
	        System.out.println("Setup: Resource initialized");
	    }

	    @After
	    public void tearDown() {
	        resource.cleanup();
	        System.out.println("Teardown: Resource cleaned up");
	    }

	    @Test
	    public void testResourceAddition() {
	        int result = resource.add(3, 5);
	        assertEquals(8, result);
	    }

	    @Test
	    public void testResourceMultiplication() {
	        int result = resource.multiply(3, 5);
	        assertEquals(15, result);
	    }
}
