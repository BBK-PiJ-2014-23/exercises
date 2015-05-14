import java.util.*;

/**
 * Write a description of class UserImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserImpl implements User
{
    private final String name;
    private int id;
    private Library lib;
    private List<String> onLoan;

    /**
     * 
     */
    public UserImpl(String name){
        this.name = name;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 
     */
    public void register(Library lib) {
        this.lib = lib;
        setId(lib.getId(name));
        onLoan = new ArrayList<String>();
    }

    /**
     * 
     */
    public String getLibrary() {
        return lib.getName();
    }
    
    /**
     * 
     */
    public void borrowBook(String title) {
        Book b = lib.takeBook(title);
        if (b != null) {
            onLoan.add(b.getTitle());
        }
    }
    
    /**
     * 
     */
    public void returnBook(Book book) {
        onLoan.remove(book);
        lib.returnBook(book);
    }
    
    /**
     * 
     */
    public List<String> getBooksBorrowed() {
        return onLoan;
    }
}
