
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class MergeSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MergeSortTester
{

    /**
     * 
     */
    @Test
    public void checkAlreadySorted() {
        List<Integer> list = new ArrayList<Integer>();
        assertEquals(MergeSort.mergeSort(list).toString(), "[]");
        list.add(3);
        assertEquals(MergeSort.mergeSort(list).toString(), "[3]");
    }

//     /**
//      * 
//      */
//     @Test
//     public void checkSorted() {
//         List<Integer> list = ListCreator.make(1000);
//         list = MergeSort.mergeSort(list);
//         assertTrue(list.size() == 1000);
//         for (int i = 0; i < list.size() - 1; i++) {
//             assertTrue(list.get(i + 1) >= list.get(i));
//         }
//     }
    
    /**
     * 
     */
    @Test
    public void checkSorted2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        list = MergeSort.mergeSort(list);
        System.out.println(list.toString());
    }
}
