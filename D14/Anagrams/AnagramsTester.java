
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AnagramTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AnagramsTester
{
    String string;
    List<String> list1;
    List<String> list2;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list1 = new ArrayList<String>();
        list2 = new ArrayList<String>();
    }

    /**
     * 
     */
    @Test
    public void testEmpty() {
        string = "";
        list2 = Anagrams.getAnagrams(string);
        assertTrue(list2.isEmpty());
    }
    
    /**
     * 
     */
    @Test
    public void testSingleLetter() {
        string = "a";
        list2 = Anagrams.getAnagrams(string);
        assertTrue(list2.isEmpty());
    }
    
    /**
     * 
     */
    @Test
    public void testTwoLetters() {
        list1.add("ih");
        string = "hi";
        list2 = Anagrams.getAnagrams(string);
        for (int i = 0; i < list1.size(); i++) {
            assertEquals(list1.get(i), list2.get(i));
        }
    }
}