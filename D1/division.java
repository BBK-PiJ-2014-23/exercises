import java.util.Scanner;
public class division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int divident = Integer.parseInt(str);
str = System.console().readLine();
int divisor = Integer.parseInt(str);

int rest = divident;
int i = 0;

while (rest >= divisor) {
	rest -= divisor;
	i++;
}
System.out.println(divident + " divided by " + divisor + " is " + i + ", remainder " + rest + ".");
	
}}

