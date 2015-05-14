
/**
 * Interface for books containing author and title.
 * 
 * @author Stefan E. Mayer
 * @version 1.0
 */
public interface Book
{
    /**
     * Returns the book's author.
     * @return the author's name
     */
    String getAuthor();
    
    /**
     * Returns the book's title.
     * @return the book's title
     */
    String getTitle();
    
    /**
     * 
     */
    boolean isTaken();
    
    /**
     * 
     */
    void setTaken(boolean taken);
}
