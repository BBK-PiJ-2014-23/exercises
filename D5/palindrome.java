import java.util.Scanner;
public class palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(palindrome("Abba"));

} private static boolean palindrome(String str) {
	if (str.length() == 2) {
		return str.charAt(0) == str.charAt(1);
	} else if (str.length() == 1) {
		return true;
	} else {
		String str2 = str.substring(1, str.length() - 1);
		return (str.charAt(0) == str.charAt(str.length() - 1)) && palindrome(str2);
	}
}
}

