import java.util.*;

/**
 * Write a description of class ListCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListCreator
{
    private static int numberRange = 1000;
    
    public static int getRange() {
        return numberRange;
    }
    
    public static List<Integer> make(int size) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            int num = (int) (Math.abs((numberRange + 1) * Math.random()));
            list.add(num);
        }
        return list;
    }
}
