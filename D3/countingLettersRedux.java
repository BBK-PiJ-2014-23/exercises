import java.util.Scanner;
public class countingLettersRedux
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean finished = false;
String letter = "";
String appeared = "";

System.out.print("Please write a text: ");
String str = System.console().readLine();

while (!finished) {
	System.out.print("Which letter would you like to count now? ");
	letter = System.console().readLine();
	for (int i = 0; i < appeared.length(); i++) {
		if (letter.equals(appeared.substring(i, i + 1))) {
			finished = true;
		}
	}
	if (!finished) {
		int counter = 0;
		
		for (int j = 0; j < str.length(); j++) {
			if (letter.equals(str.substring(j, j + 1))) {
				counter++;
			}
		}
		System.out.println("There are " + counter + " in your text.");
		appeared += letter;
	}
}
System.out.println("Repeated character. Exiting the program...");
System.out.println("Thank you for your cooperation. Good bye!");
}}

