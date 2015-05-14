import java.util.*;
/**
 * Write a description of class ResponsiveUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResponsiveUI implements Runnable
{
    public static void main(String[] args) {
        final int NUMBER_OF_TASKS = 10;
        int[] finished = new int[NUMBER_OF_TASKS];
        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            ResponsiveUI ui = new ResponsiveUI();
            Thread t = new Thread(ui);
            t.start();
            
        }

    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the duration (in ms) of task );
        int duration = sc.nextInt();

    }
}
