import java.util.Scanner;
public class guessMyNumber
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int numberToGuess = (int) (Math.abs(1000 * Math.random()));
int guesses = 0;
boolean finished = false;

System.out.println("Try to guess my number!");
while (!finished) {
	System.out.print("Tell me a number: ");
	int guess = Integer.parseInt(System.console().readLine());
	if (guess == numberToGuess) {
		finished = true;
	} else if (guess < numberToGuess) {
		System.out.println("No! My number is higher.");
	} else {
		System.out.println("No! My number is lower.");
	}
	guesses++;
}
System.out.println("CORRECT!");
System.out.println("You needed " + guesses + ".");
}}

