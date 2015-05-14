import java.util.Scanner;
public class power
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(MathHelper.powIterative(2, 8));
System.out.println(MathHelper.powRecursive(2, 8));

}}

class MathHelper {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	static int powIterative(int base, int exponent) {
		int result = base;
		for (int i = 0; i < exponent - 1; i++) {
			result *= base;
		}
		return result;
	}
	
	static int powRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * powRecursive(base, exponent - 1);
		}
	}
}
