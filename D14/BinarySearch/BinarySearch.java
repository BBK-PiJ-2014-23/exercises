import java.util.*;

/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static boolean binarySearch(List<Integer> list, int num) {
        if (list.size() == 0) {
            return false;
        } else {
            int half = list.get(list.size() / 2);
            if (half == num) {
                return true;
            } else if (list.size() == 1) {
                return false;
            } else if (half > num) {
                list = list.subList(0, list.size() / 2);
                return binarySearch(list, num);
            } else if (half < num) {
                list = list.subList(list.size() / 2, list.size());
                return binarySearch(list, num);
            } else {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        List<Integer> list = SortedListCreator.createSortedList(1);
        System.out.println(list.get(0));
        System.out.println(BinarySearch.binarySearch(list, 0));
    }
}
