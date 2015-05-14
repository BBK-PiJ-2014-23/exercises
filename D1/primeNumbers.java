import java.util.Scanner;
public class primeNumbers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int num = Integer.parseInt(str);
int i = num - 1;
boolean isPrime = true;
while (i > 1 && isPrime) {
	if (num % i == 0) {
		isPrime = false;
	} else {
		i--;
	}
}
if (isPrime) {
	System.out.println("Your number is a prime");
} else {
	System.out.println("Your number is not a prime");
}
}}

