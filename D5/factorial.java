import java.util.Scanner;
public class factorial
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(factorialRecursive(5));
System.out.println(factorialIterative(5));

} private static int factorialRecursive(int n) {
	if (n == 1) {
		return 1;
	} else {
		
		return n * (factorialRecursive(n - 1));
	}
}

 private static int factorialIterative(int n) {
	int result = n;
	for (int i = n - 1; i > 0; i--) {
		result *= i;
	}
	return result;
}
}

