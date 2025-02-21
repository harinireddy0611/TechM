package junittasks;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task10_test {
    private Task10_junit_comp1 userRepository;
    private Task10_junit_comp2 userService;

    @Before
    public void setUp() {
        userRepository = new Task10_junit_comp1();
        userService = new Task10_junit_comp2(userRepository);
    }

    @Test
    public void testRegisterUser_Success() {
        boolean result = userService.registerUser("Alice", 20);
        assertTrue(result);
        
        Task10_junit retrievedUser = userService.getUser("Alice");
        assertNotNull(retrievedUser);
        assertEquals("Alice", retrievedUser.getName());
        assertEquals(20, retrievedUser.getAge());
    }

    @Test
    public void testRegisterUser_FailUnderage() {
        boolean result = userService.registerUser("Bob", 16);
        assertFalse(result);
        
        Task10_junit retrievedUser = userService.getUser("Bob");
        assertNull(retrievedUser);
    }
}
