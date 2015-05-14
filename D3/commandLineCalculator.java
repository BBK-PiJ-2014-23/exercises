import java.util.Scanner;
public class commandLineCalculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean operator = false;
String strNum1 = "";
String strNum2 = "";
String strOperator = "";
double num1 = 0;
double num2 = 0;
double result = 0;

System.out.print("This is a calculator. Please enter your operation: ");
String str = System.console().readLine();

for (int i = 0; i < str.length(); i++) {
	if (!operator && !str.substring(i, i + 1).equals("+") && !str.substring(i, i + 1).equals("-") &&
					 !str.substring(i, i + 1).equals("*") && !str.substring(i, i + 1).equals("/")) {
		strNum1 += str.substring(i, i + 1);
	} else if (str.substring(i, i + 1).equals("+") || str.substring(i, i + 1).equals("-") ||
			   str.substring(i, i + 1).equals("*") || str.substring(i, i + 1).equals("/")) {
		strOperator = str.substring(i, i + 1);
		operator = true;
	} else {
		strNum2 += str.substring(i, i + 1);
	}
}

num1 = Double.parseDouble(strNum1);
num2 = Double.parseDouble(strNum2);

if (strOperator.equals("+")) {
	result = num1 + num2;
} else if (strOperator.equals("-")) {
	result = num1 - num2;
} else if (strOperator.equals("*")) {
	result = num1 * num2;
} else if (strOperator.equals("/")) {
	result = num1 / num2;
}

System.out.println("Result: " + result);
}}

