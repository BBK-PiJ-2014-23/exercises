import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SimpleMapImplTester.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class SimpleMapImplTester
{
    @Test
    public void test() {
        SimpleMap map = new SimpleMapImpl();
        
        assertTrue(map.isEmpty());
        assertNull(map.get(9));
        
        map.put(0, "0");
        assertFalse(map.isEmpty());
        assertEquals(map.get(0), "0");
        map.remove(0);
        assertTrue(map.isEmpty());
        
        map.put(0, "0");
        map.put(1, "1");
        assertFalse(map.isEmpty());
        assertEquals(map.get(0), "0");
        assertEquals(map.get(1), "1");
        map.remove(0);
        assertFalse(map.isEmpty());
        map.remove(1);
        assertTrue(map.isEmpty());
        
        map.put(1, "1");
        map.put(0, "0");
        assertFalse(map.isEmpty());
        assertEquals(map.get(0), "0");
        assertEquals(map.get(1), "1");
        map.remove(0);
        assertFalse(map.isEmpty());
        map.remove(1);
        assertTrue(map.isEmpty());
    }
}
