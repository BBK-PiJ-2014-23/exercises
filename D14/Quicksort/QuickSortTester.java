
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class QuickSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuickSortTester
{
    /**
     * 
     */
    @Test
    public void checkAlreadySorted() {
        List<Integer> list = new ArrayList<Integer>();
        assertEquals(QuickSort.quickSort(list).toString(), "[]");
        list.add(3);
        assertEquals(QuickSort.quickSort(list).toString(), "[3]");
    }

    /**
     * 
     */
    @Test
    public void checkSorted() {
        List<Integer> list = ListCreator.make(1000);
        list = QuickSort.quickSort(list);
        assertTrue(list.size() == 1000);
        for (int i = 0; i < list.size() - 1; i++) {
            assertTrue(list.get(i + 1) >= list.get(i));
        }
    }
}
