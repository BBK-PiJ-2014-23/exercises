import java.util.Scanner;
public class goingUp
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int input = Integer.parseInt(str);
int last = input;
boolean isConsecIncr = true;

while (input != -1) {
	str = System.console().readLine();
	input = Integer.parseInt(str);
	if (input == last + 1) {
		last = input;
	} else if (input != -1) {
		isConsecIncr = false;
	}
}
if (isConsecIncr) {
	System.out.println("Yes");
} else {
	System.out.println("No");
}
}}

