import java.util.Scanner;
public class countingPairsOfLetters
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Enter a short text: ");
String shortStr = System.console().readLine();
System.out.print("Enter a longer text: ");
String str = System.console().readLine();
int counter = 0;

for (int i = 0; i < str.length() - shortStr.length() + 1; i++) {
	boolean match = true;
	for (int j = 0; j < shortStr.length(); j++) {
		if (shortStr.charAt(j) != str.charAt(i + j)) {
			match = false;
		}
	}
	if (match) {
		counter++;
	}
}
System.out.println("The longer text contains the shorter text " + counter + " times.");
}}

