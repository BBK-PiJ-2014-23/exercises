import java.util.Scanner;
public class maximising
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int max = 0;
int input = 0;
while (input != -1) {
	String str = System.console().readLine();
	input = Integer.parseInt(str);
	if (input > max) {
		max = input;
	}
}
System.out.println(max);
}}

