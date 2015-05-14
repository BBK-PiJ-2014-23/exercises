import java.util.Scanner;
public class countingLetters
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Enter some text: ");
String str = System.console().readLine();
System.out.print("Enter the letter you would like to count: ");
String letter = System.console().readLine();
int strLength = str.length();
int counter = 0;

for (int i = 0; i < strLength; i++) {
	if (str.substring(i, i + 1).equals(letter)) {
		counter++;
	}
}
System.out.println("Letter " + letter + " appears in your text " + counter + " times.");
}}

