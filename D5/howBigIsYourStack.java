import java.util.Scanner;
public class howBigIsYourStack
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
stackOverflowString("0");

} private static void stackOverflowInt(int n) {
	System.out.println(n);
	stackOverflowInt(n + 1);
}

 private static void stackOverflowDouble(double n) {
	System.out.println(n);
	stackOverflowDouble(n + 1);
}

 private static void stackOverflowString(String n) {
	int nInt = Integer.parseInt(n);
	System.out.println(nInt);
	stackOverflowString(Integer.toString(nInt + 1));
}
}

