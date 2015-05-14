import java.util.*;

/**
 * Write a description of class CodeFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodeFlow
{
    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        CodeFlow flow = new CodeFlow();
        flow.launch(0);
        flow = new CodeFlow();
        flow.launch(2);
        flow = new CodeFlow();
        flow.launch(4);
        flow = new CodeFlow();
        flow.launch(6);
    }
}
