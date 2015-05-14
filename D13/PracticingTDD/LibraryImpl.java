import java.util.*;

/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibraryImpl implements Library
{
    private final String name;
    private int maxBooksAtOnce;
    private List<User> users;
    private List<Book> books;

    /**
     * 
     */
    public LibraryImpl(String name) {
        this.name = name;
        this.users = new ArrayList<User>();
        this.books = new ArrayList<Book>();
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
    public List<Book> getCollection() {
        return books;
    }

    /**
     * 
     */
    public void setMaxBooksPerUser(int max) {
        maxBooksAtOnce = max;
    }

    /**
     * 
     */
    public int getMaxBooksPerUser() {
        return maxBooksAtOnce;
    }

    /**
     * 
     */
    public int getId(String personName) {
        boolean found = false;
        int i = 0;  
        while (i < users.size() && !found) {
            if (users.get(i).getName().equals(personName)) {
                found = true;
            } else {
                i++;
            }
        }
        if (!found) {
            users.add(new UserImpl(personName));
        }
        return i;
    }

    /**
     * 
     */
    public void addBook(String title, String author) {
        books.add(new BookImpl(author, title));
    }

    /**
     * 
     */
    public Book takeBook(String title) {
        boolean found = false;
        int i = 0;  
        while (i < books.size() && !found) {
            if (books.get(i).getTitle().equals(title)) {
                found = true;
            } else {
                i++;
            }
        }
        if (found && books.get(i).isTaken() == false) {
            books.get(i).setTaken(true);
            return books.get(i);
        } else {
            return null;
        }
    }

    /**
     * 
     */
    public void returnBook(Book book) {
        int i = books.indexOf(book);
        books.get(i).setTaken(false);
    }

    /**
     * 
     */
    public int getReaderCount() {
        return users.size();
    }

    /**
     * 
     */
    public int getBookCount() {
        return books.size();
    }

    /**
     * 
     */
    public int getBookBorrowedCount() {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isTaken()) {
                count++;
            }
        }
        return count;
    }

    /**
     * 
     */
    public List<User> getUsersWithLoans() {
        List<User> usersWithLoans = new ArrayList<User>();
        for (int i = 0; i < users.size(); i++) {
           // if (!users.get(i).getBooksBorrowed().isEmpty()) {
                usersWithLoans.add(users.get(i));
            //}
        }
        return usersWithLoans;
    }
}