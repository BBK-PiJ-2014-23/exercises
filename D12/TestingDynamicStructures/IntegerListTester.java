import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class IntegerListTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntegerListTester
{
    @Test
    public void test() {
        IntegerList sorted = new IntegerList();

        sorted.add(5);
        assertEquals(sorted.getList(), "5, ");
        
        sorted.add(7);
        assertEquals(sorted.getList(), "5, 7, ");
        
        sorted.add(3);
        assertEquals(sorted.getList(), "3, 5, 7, ");
        
        sorted.add(-1);
        assertEquals(sorted.getList(), "-1, 3, 5, 7, ");
    }
}
