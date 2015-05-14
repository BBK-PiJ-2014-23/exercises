import java.util.Scanner;
public class fibonacci
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(fibonacciRecursive(6));
System.out.println(fibonacciIterative(1));

} private static int fibonacciRecursive(int n) {
	if ((n == 1) || (n == 2)) {
		return 1;
	} else {
		return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
	}
}

 private static int fibonacciIterative(int n) {
	int former = 1;
	int latest = 1;
	for (int i = 2; i < n; i++) {
		int temp = former + latest;
		former = latest;
		latest = temp;
	}
	return latest;
}
}

