import java.util.*;

/**
 * Write a description of interface User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface User
{
    /**
     * 
     */
    String getName();
    
    /**
     * 
     */
    void setId(int ID);
    
    /**
     * 
     */
    int getId();
    
    /**
     * 
     */
    void register(Library lib);
    
    /**
     * 
     */
    String getLibrary();
    
    /**
     * 
     */
    void borrowBook(String title);
    
    /**
     * 
     */
    void returnBook(Book book);
    
    /**
     * 
     */
    List<String> getBooksBorrowed();
}
