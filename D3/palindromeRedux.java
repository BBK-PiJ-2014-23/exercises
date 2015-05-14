import java.util.Scanner;
public class palindromeRedux
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Enter a text: ");
String str = System.console().readLine();
String strLetters = "";
boolean palindrome = true;

for (int i = 0; i < str.length(); i++) {
	
	if (Character.isLetter(str.charAt(i))) {
		strLetters += Character.toLowerCase(str.charAt(i));
	}
}

for (int i = 0; i < strLetters.length(); i++) {
	char letter1 = strLetters.charAt(i);
	char letter2 = strLetters.charAt(strLetters.length() - 1 - i);
	if (letter1 != letter2) {
		palindrome = false;
	}
}

if (palindrome) {
	System.out.println("Your text is a palindrom.");
} else {
	System.out.println("Your text is not a palindrom.");
}
}}

