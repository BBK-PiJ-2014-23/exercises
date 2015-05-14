import java.util.*;

/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HailstoneNumbers
{
    private List<Integer> numbers = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HailstoneNumbers x = new HailstoneNumbers();
        x.hailstone(num);
        System.out.print(x.numbers.toString()); 
    }
    public List<Integer> hailstone(int num) {
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = 3*num + 1;
        }
        numbers.add(num);
        if (num != 1) {
            hailstone(num);
        }
        return numbers;
    }
}
