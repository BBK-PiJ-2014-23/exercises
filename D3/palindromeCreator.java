import java.util.Scanner;
public class palindromeCreator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();

System.out.print(str);
for (int i = str.length() - 1; i >= 0; i--) {
	System.out.print(str.charAt(i));
}
}}

