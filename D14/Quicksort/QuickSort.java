import java.util.*;

/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort
{
    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            List<Integer> sorted = new ArrayList<Integer>();
            List<Integer> lower = new ArrayList<Integer>();
            List<Integer> higher = new ArrayList<Integer>();
            int pivot = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= pivot) {
                    lower.add(list.get(i));
                } else {
                    higher.add(list.get(i));
                }
            }
            
            sorted.addAll(quickSort(lower));
            sorted.add(pivot);
            sorted.addAll(quickSort(higher));
            return sorted;
        }
    }
}
