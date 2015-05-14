import java.util.*;
/**
 * Write a description of class PrimeDivisorList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeDivisorListImpl implements PrimeDivisorList
{
    List<Integer> list;

    /**
     * 
     */
    public PrimeDivisorListImpl() {
        list = new ArrayList<Integer>();
    }

    /**
     * 
     */
    @Override
    public void add(Integer number) {
        if (number == null) {
            throw new NullPointerException();
        } else if (!isPrime(number)) {
            throw new IllegalArgumentException();
        } else {
            list.add(number);
        }
    }

    /**
     * 
     */
    @Override
    public String toString() {
        String str = "";
        if (list.size() > 0) {
            list.sort(null);
            str+= list.get(0);
            int product = list.get(0);
            int counter = 1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) == list.get(i - 1)) {
                    counter++;
                } else if (counter != 1) {
                    str += "^" + counter + " * " + list.get(i);
                    counter = 0;
                } else {
                    str += " * " + list.get(i);
                }
                product *= list.get(i);
            }
            str += " = " + product;
        }
        System.out.println("[ " + str + " ]");
        return str;
    }

    /**
     * 
     */
    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
