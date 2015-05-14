
/**
 * Implementation of interface book containing author and title.
 * 
 * @author Stefan E. Mayer
 * @version 1.1
 */
public class BookImpl implements Book
{
    private final String author;
    private final String title;
    private boolean isTaken;
    
    /**
     * Constructor for a book object.
     */
    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
        isTaken = false;
    }
    
    /**
     * Returns the book's author.
     * @return the author's name
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Returns the book's title.
     * @return the book's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * 
     */
    public boolean isTaken() {
        return isTaken;
    }
    
    /**
     * 
     */
    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
}
