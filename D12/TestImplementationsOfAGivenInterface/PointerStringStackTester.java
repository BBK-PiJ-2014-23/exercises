import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class PointerStringStackTester.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class PointerStringStackTester {
    @Test
    public void Test() {
        StringStack stack = new PointerStringStack();
        assertTrue(stack.isEmpty());
        assertNull(stack.peek());
        assertNull(stack.pop());
        
        
        stack.push("0");
        assertFalse(stack.isEmpty());
        assertEquals(stack.peek(), "0");
        assertEquals(stack.pop(), "0");
        
        stack.push("0");
        stack.push("1");
        assertEquals(stack.peek(), "1");
        assertEquals(stack.pop(), "1");
        assertEquals(stack.peek(), "0");
        assertEquals(stack.pop(), "0");
        
    }
}
