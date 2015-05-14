import java.util.Scanner;
public class naiveSorting
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str = System.console().readLine();
int min = Integer.parseInt(str);
str = System.console().readLine();
int med = Integer.parseInt(str);
str = System.console().readLine();
int max = Integer.parseInt(str);

int tmp;

if (max < med) {
	tmp = max;
	max = med;
	med = tmp;
	if (med < min) {
		tmp = med;
		med = min;
		min = tmp;
		if (max < med) {
			tmp = max;
			max = med;
			med = tmp;
		}
	}
} else {
	if (med < min) {
		tmp = med;
		med = min;
		min = tmp;
		if (max < med) {
			tmp = max;
			max = med;
			med = tmp;
		}
	}
}

System.out.print(min + " " + med + " " + max);



}}

