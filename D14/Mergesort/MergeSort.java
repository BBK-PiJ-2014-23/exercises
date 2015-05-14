import java.util.*;

/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergeSort
{
    //private static List<Integer> list = new ArrayList<Integer>();

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            List<Integer> sorted = new ArrayList<Integer>();
            List<Integer> first = list.subList(0, list.size() / 2);
            List<Integer> second = list.subList(list.size() / 2, list.size());

            List<Integer> firstSorted = mergeSort(first);
            System.out.println("first" + first.toString());
            List<Integer> secondSorted = mergeSort(second);
            System.out.println("second" + second.toString());
            if (first.get(0) <= second.get(0)) {
                list.add(0, first.get(0));
                list.add(list.size() - 1, second.get(0));
                System.out.println("list1" + list.toString());
            } else {
                list.add(0, second.get(0));
                list.add(list.size() - 1, first.get(0));
                System.out.println("list2" + list.toString());
            }
            return sorted;
        }
    }
}
