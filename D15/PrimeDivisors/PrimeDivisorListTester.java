
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PrimeDivisorListTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PrimeDivisorListTester
{
    PrimeDivisorList list;
    /**
     * Default constructor for test class PrimeDivisorListTester
     */
    public PrimeDivisorListTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new PrimeDivisorListImpl();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * 
     */
    @Test(expected = NullPointerException.class)
    public void addNull() {
        list.add(null);
    }
    
    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void addNonPrime() {
        list.add(4);
    }
    
    /**
     * 
     */
    @Test
    public void toStringEmpty() {
        assertEquals(list.toString(), "");
    }
    
    /**
     * 
     */
    @Test
    public void toStringOneNumber() {
        list.add(2);
        assertEquals(list.toString(), "2 = 2");
    }
    
    /**
     * 
     */
    @Test
    public void toStringDifferentNumbers() {
        list.add(2);
        list.add(3);
        list.add(7);
        assertEquals(list.toString(), "2 * 3 * 7 = 42");
    }
    
    /**
     * 
     */
    @Test
    public void toStringSameNumbers() {
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);
        assertEquals(list.toString(), "2 * 3^2 * 7 = 126");
    }
}
