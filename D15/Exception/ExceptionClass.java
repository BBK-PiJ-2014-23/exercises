import java.util.*;

/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExceptionClass
{
    // Some code here
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        Object newElement = null;
        try {
            // more code here
            list.add(newElement);
            list.get(0).toString();
            // more code here
        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Generic exception");
            ex.printStackTrace();
        } try {
            list.get(9);
        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Generic exception");
            ex.printStackTrace();{
            }
        }
    }
}
