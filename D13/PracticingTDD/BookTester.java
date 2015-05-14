
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTester.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class BookTester
{
    /**
     * Book test object.
     */
    Book b;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        b = new BookImpl("Mayer", "Java Rocks");
    }

    /**
     * Checks if author and title are returned correctly.
     */
    @Test
    public void getAuthorTitle() {
        assertEquals(b.getAuthor(), "Mayer");
        assertEquals(b.getTitle(), "Java Rocks");
    }
    /**
     * 
     */
    @Test
    public void checkAvailability() {
        assertFalse(b.isTaken());
        b.setTaken(true);
        assertTrue(b.isTaken());
    }
}
