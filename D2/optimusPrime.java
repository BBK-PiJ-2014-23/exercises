import java.util.Scanner;
public class optimusPrime
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int input = Integer.parseInt(System.console().readLine());

int primeLower = 0;
int primeHigher = 0;
int dividend = input;
int divisor = input;

boolean foundPrimeLower = false;
while (!foundPrimeLower) {
	if (dividend % divisor != 0 || dividend == divisor) {
		divisor--;
	} else {
		dividend--;
		divisor = dividend;
	}
	if (divisor == 1) {
		foundPrimeLower = true;
		primeLower = dividend;
	}
}

boolean foundPrimeHigher = false;
while (!foundPrimeHigher) {
	if (dividend % divisor != 0 || dividend == divisor) {
		divisor--;
	} else {
		dividend++;
		divisor = dividend;
	}
	if (divisor == 1) {
		foundPrimeHigher = true;
		primeHigher = dividend;
	}
}

if (input - primeLower < primeHigher - input) {
	System.out.println(primeLower);
} else if (input - primeLower == primeHigher - input) {
	System.out.println(primeLower);
	System.out.println(primeHigher);
} else {
	System.out.println(primeHigher);
}
}}

