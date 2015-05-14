import java.util.*;

/**
 * Write a description of interface Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Library
{
    /**
     * 
     */
    String getName();

    /**
     * 
     */
    List<Book> getCollection();

    /**
     * 
     */
    void setMaxBooksPerUser(int max);

    /**
     * 
     */
    int getMaxBooksPerUser();

    /**
     * 
     */
    int getId(String personName);

    /**
     * 
     */
    void addBook(String title, String author);

    /**
     * 
     */
    Book takeBook(String title);
    
    /**
     * 
     */
    void returnBook(Book book);
    
    /**
     * 
     */
    int getReaderCount();
    
    /**
     * 
     */
    int getBookCount();
    
    /**
     * 
     */
    int getBookBorrowedCount();
    
    /**
     * 
     */
    List<User> getUsersWithLoans();
}
