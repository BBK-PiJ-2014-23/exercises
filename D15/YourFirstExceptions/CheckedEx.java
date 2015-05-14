
/**
 * Write a description of class CheckedException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckedEx extends Exception
{
    public CheckedEx() {
        super();
    }
    
    public CheckedEx(String reason) {
        super(reason);
    }
}
