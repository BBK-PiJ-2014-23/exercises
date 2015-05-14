

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListTester
{
    @Test
    public void testSorter() {
        final int LIST_SIZE = 100;
        
        List list = new List();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add((int)(100 * Math.random()));
        }
        
        for (int i = 1; i < LIST_SIZE; i++) {
            assertTrue(list.get(i) >= list.get(i - 1));
        }
    }
}
