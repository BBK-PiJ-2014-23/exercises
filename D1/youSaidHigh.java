import java.util.Scanner;
public class youSaidHigh
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int input = Integer.parseInt(str);
int last = input;
boolean isConsec = true;
boolean isUp = false;
boolean isDown = false;

while (input != -1) {
	str = System.console().readLine();
	input = Integer.parseInt(str);
	if (input == last + 1) {
		last = input;
		isUp = true;
	} else if (input == last - 1) {
		last = input;
		isDown = true;
	} else if (input != -1) {
		isConsec = false;
	}
}
if (isConsec && (isUp != isDown)) {
	System.out.println("Yes");
} else {
	System.out.println("No");
}
}}

