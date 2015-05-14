import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class DoublyLinkedPatientList.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class DoublyLinkedPatientListTester {
    @Test
    public void test() {
        DoublyLinkedPatientList list = new DoublyLinkedPatientList();
        Patient p0 = new Patient("0", 0, "illness0");
        Patient p1 = new Patient("1", 1, "illness1");

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
    }
}

