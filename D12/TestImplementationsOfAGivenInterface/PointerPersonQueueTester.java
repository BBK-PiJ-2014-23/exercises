import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class PointerPersonQueueTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PointerPersonQueueTester
{
    @Test
    public void test() {
        PersonQueue queue = new PointerPersonQueue();

        assertNull(queue.retrieve());

        Person p0 = new Person("0");
        Person p1 = new Person("1");
        
        queue.insert(p0);
        assertEquals(queue.retrieve(), p0);
        assertNull(queue.retrieve());

        queue.insert(p0);
        queue.insert(p1);
        assertEquals(queue.retrieve(), p0);
        assertEquals(queue.retrieve(), p1);
        assertNull(queue.retrieve());
    }
}
