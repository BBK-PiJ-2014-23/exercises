import java.util.Scanner;
public class pi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int n = Integer.parseInt(System.console().readLine());
double pi = 0;
int pi3 = 0;
int pi10 = 0;
boolean pi3found = false;
boolean pi10found = false;

for (int i = 0; i < n; i++) {
	if (i % 2 == 0 || i == 0) {
		pi = pi + 4.0 / (2 * i + 1);
	} else {
		pi = pi - 4.0 / (2 * i + 1);
	}
	
	if (!pi3found) {
		if (pi > 3.13 && pi < 3.15) {
			pi3 = i + 1;
			pi3found = true;
		}
	}
	if (!pi10found) {
		if (pi > 3.14159265357 && pi < 3.14159265359) {
			pi10 = i + 1;
			pi10found = true;
		}
	}
}
System.out.println(pi);
System.out.println(pi3);
System.out.println(pi10);
}}

