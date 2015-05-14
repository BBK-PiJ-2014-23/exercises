
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTester
{
    private Library lib;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        lib = new LibraryImpl("Birkbeck");
    }

    /**
     * 
     */
    @Test
    public void checkMaxBooks() {
        lib.setMaxBooksPerUser(6);
        assertEquals(lib.getMaxBooksPerUser(), 6);
    }

    /**
     * 
     */
    @Test
    public void getUserId() {
        assertEquals(lib.getId("Mayer"), 0);
        assertEquals(lib.getId("Mayer"), 0);
        assertEquals(lib.getId("Miller"), 1);
        assertEquals(lib.getId("Miller"), 1);
    }

    /**
     * 
     */
    @Test
    public void addBook() {
        lib.addBook("Java is awesome", "Mayer");
        lib.addBook("Programming rocks", "Miller");
        assertEquals(lib.getCollection().get(0).getTitle(), "Java is awesome");
        assertEquals(lib.getCollection().get(1).getTitle(), "Programming rocks");
    }

    /**
     * 
     */
    @Test
    public void takeBook() {
        lib.addBook("Programming rocks", "Miller");
        assertEquals(lib.takeBook("Programming rocks"), lib.getCollection().get(0));
        assertNull(lib.takeBook("Programming rocks"));
    }

    /**
     * 
     */
    @Test
    public void returnBook() {
        lib.addBook("Programming rocks", "Miller");
        lib.takeBook("Programming rocks");
        lib.returnBook(lib.getCollection().get(0));
        assertFalse(lib.getCollection().get(0).isTaken());
    }

    /**
     * 
     */
    @Test
    public void getBookAndReaderCount() {
        assertEquals(lib.getBookCount(), 0);
        lib.addBook("Java is awesome", "Mayer");
        lib.addBook("Programming rocks", "Miller");
        assertEquals(lib.getBookCount(), 2);

        assertEquals(lib.getReaderCount(), 0);
        User one = new UserImpl("Stefan");
        User two = new UserImpl("Simon");
        one.register(lib);
        two.register(lib);
        assertEquals(lib.getReaderCount(), 2);
    }

    /**
     * 
     */
    @Test
    public void getBookBorrowedCount() {
        assertEquals(lib.getBookBorrowedCount(), 0);
        lib.addBook("Java is awesome", "Mayer");
        lib.addBook("Programming rocks", "Miller");
        lib.takeBook("Java is awesome");
        assertEquals(lib.getBookBorrowedCount(), 1);
    }

    /**
     * 
     */
    @Test
    public void getUsersWithLoans() {
        lib.addBook("Java is awesome", "Mayer");
        lib.addBook("Programming rocks", "Miller");
        User one = new UserImpl("Stefan");
        User two = new UserImpl("Simon");
        one.register(lib);
        two.register(lib);
        assertEquals(lib.getUsersWithLoans().toString(), "[]");
        //one.borrowBook("Java is awesome");
        //two.borrowBook("Programming rocks");
        //assertEquals(lib.getUsersWithLoans().get(0).getName(), "Mayer");
        //assertEquals(lib.getUsersWithLoans().get(1).getName(), "Miller");
    }
}