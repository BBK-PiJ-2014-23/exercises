import java.util.Scanner;
public class multiplication
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int num1 = Integer.parseInt(str);
str = System.console().readLine();
int num2 = Integer.parseInt(str);
int product = 0;
while (num2 > 0) {
	product += num1;
	num2--;
}
System.out.println(product);
}}

