import java.util.*;
/**
 * Write a description of class sdf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ErrorHandlingOnUserInput
{
    public static void main (String[] args) {
        int numbers = readUserInput("Please enter the amount of numbers to be entered: ");
        int current = 0;
        int total = 0;
        for (int i = 0; i < numbers; i++) {
            current = readUserInput("Please enter a number: ");
            total += current;
        }
        int mean = total / numbers;
        System.out.println("The mean average is: " + mean);
    }

    private static int readUserInput(String prompt) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            Scanner sc = new Scanner(System.in);
            System.out.print(prompt);
            try {
                input = sc.nextInt();
                isValid = true;
            } catch (InputMismatchException ex) {
                System.out.println("What you entered is not an integer number!");
            }
        }
        return input;
    }
}