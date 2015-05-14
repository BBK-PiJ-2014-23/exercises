import java.util.Scanner;
public class text2number
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please enter a number with commas and decimal dots: ");
String str = System.console().readLine();
String strNumbersOnly = "";
double number = 0;
double multiplicator = 0.01;

for (int i = 0; i < str.length(); i++) {
	String thisChar = str.substring(i, i + 1);
	if (!thisChar.equals(",") && !thisChar.equals(".")) {
		strNumbersOnly = strNumbersOnly + thisChar;
		}
}

for (int i = strNumbersOnly.length() - 1; i >= 0; i--) {
	int thisNum = Integer.parseInt(strNumbersOnly.substring(i, i + 1));
	number = number + (double)(thisNum) * multiplicator;
	multiplicator *= 10;
}
number /= 2;
System.out.println("Half of your number is " + number);
}}

