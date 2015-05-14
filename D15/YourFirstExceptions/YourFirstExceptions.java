import java.util.*;

/**
 * Write a description of class YourFirstExceptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YourFirstExceptions
{
    public static void main(String[] args) throws CheckedEx {
        launch();
    }

    public static void launch() throws CheckedEx {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("unchecked")) {
            throw new RuntimeEx("I am a runtime exception and I have been thrown without a try block");
        } else if (input.equals("checked")) {
            throw new CheckedEx("I am a checked exception and I have been thrown without a try block");
        }
        try {
            if (input.equals("tryUnchecked")) {
                throw new RuntimeEx();
            } else if (input.equals("tryChecked")) {
                throw new CheckedEx();
            }
        } catch (RuntimeEx ex) {
            System.out.println("I am a runtime exception and I have been thrown out of a try block");
        } catch (CheckedEx ex) {
            System.out.println("I am a checked exception and I have been thrown out of a try block");
        }
    }
}
