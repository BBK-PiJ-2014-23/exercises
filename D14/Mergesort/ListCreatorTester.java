
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListCreatorTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListCreatorTester
{
    /**
     * 
     */
    @Test
    public void sizeTester() {
        List<Integer> list = ListCreator.make(10);
        assertEquals(list.size(), 10);
        list = ListCreator.make(100);
        assertEquals(list.size(), 100);
        list = ListCreator.make(1000);
        assertEquals(list.size(), 1000);
    }

    /**
     * 
     */
    @Test
    public void testNumbers() {
        List<Integer> list = ListCreator.make(1000);
        for (int i = 0; i < list.size(); i++) {
            assertTrue(list.get(i).getClass().equals(Integer.class));
        }
    }
}