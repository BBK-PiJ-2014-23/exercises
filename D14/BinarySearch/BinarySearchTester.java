
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinarySearchTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTester
{
    /**
     * 
     */
    @Test
    public void findInEmpty() {
        List<Integer> empty = new ArrayList<Integer>();
        assertEquals(empty.size(), 0);
        assertFalse(BinarySearch.binarySearch(empty, 0));
        assertFalse(BinarySearch.binarySearch(empty, 1));
    }

    /**
     * 
     */
    @Test
    public void findInFilled() {
        List<Integer> list = ListCreator.makeSorted(10);
        for (int i = 0; i <= ListCreator.getRange(); i++) {
            if (list.contains(i)) {
                assertTrue(BinarySearch.binarySearch(list, i));
            } else {
                assertFalse(BinarySearch.binarySearch(list, i));
            }
        }
        list = ListCreator.makeSorted(100);
        for (int i = 0; i <= ListCreator.getRange(); i++) {
            if (list.contains(i)) {
                assertTrue(BinarySearch.binarySearch(list, i));
            } else {
                assertFalse(BinarySearch.binarySearch(list, i));
            }
        }
        list = ListCreator.makeSorted(1000);
        for (int i = 0; i <= ListCreator.getRange(); i++) {
            if (list.contains(i)) {
                assertTrue(BinarySearch.binarySearch(list, i));
            } else {
                assertFalse(BinarySearch.binarySearch(list, i));
            }
        }
    }
}
