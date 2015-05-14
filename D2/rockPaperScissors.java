import java.util.Scanner;
public class rockPaperScissors
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// PP, PR, PS, RP, RR, RS, SP, SR, or SS

int score1 = 0;
int score2 = 0;

System.out.println("Rock, Paper, Scissors");
while (score1 - score2 <= 3 && score2 - score1 <= 3) {
	System.out.println();
	System.out.println("Please enter input of two players. Valid inputs:");
	System.out.println("PP, PR, PS, RP, RR, RS, SP, SR, or SS");
	String input = System.console().readLine();
	if (input.equals("PR") || input.equals("RS") || input.equals("SP")) {
		score1++;
		System.out.println("Player 1 scores.");
	} else if (input.equals("RP") || input.equals("SR") || input.equals("PS")) {
		score2++;
		System.out.println("Player 2 scores.");
	} else if (input.equals("PP") || input.equals("RR") || input.equals("SS")) {
		System.out.println("Draw.");
	} else {
		System.out.println("Invalid input.");
	}
}
System.out.println();
if (score2 - score1 <= 3) {
	System.out.println("Player 1 wins.");
} else {
	System.out.println("Player 2 wins.");
}

}}

