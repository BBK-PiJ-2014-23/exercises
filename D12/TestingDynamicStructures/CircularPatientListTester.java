import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class CircularPatientListTester.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class CircularPatientListTester {
    @Test
    public void test() {
        CircularPatientList list = new CircularPatientList();
        Patient p0 = new Patient("0", 0, "illness0");
        Patient p1 = new Patient("1", 1, "illness1");
        Patient p2 = new Patient("2", 2, "illness2");

        assertEquals(list.length(), 0);

        list.add(p0);
        assertEquals(list.length(), 1);
        list.delete(p0);
        assertEquals(list.length(), 0);
        
        list.add(p0);
        list.add(p1);   
        assertEquals(list.length(), 2);
        list.delete(p0);
        assertEquals(list.length(), 1);
        list.delete(p1);
        assertEquals(list.length(), 0);
        
        list.add(p0);
        list.add(p1);
        assertEquals(list.length(), 2);
        list.delete(p1);
        assertEquals(list.length(), 1);
        list.delete(p0);
        assertEquals(list.length(), 0);
        
        list.add(p0);
        list.add(p1);
        list.add(p2);
        assertEquals(list.length(), 3);
        list.delete(p1);
        assertEquals(list.length(), 2);
        list.delete(p2);
        assertEquals(list.length(), 1);
        list.delete(p0);
        assertEquals(list.length(), 0);
    }
}

