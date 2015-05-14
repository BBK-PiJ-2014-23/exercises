import java.util.Scanner;
public class paperSizes
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
paper("A00");

} private static int paper(String size) {
	int n = 0;
	if (size.charAt(1) != '0') {
		n = Integer.parseInt(size.substring(1, size.length()));
		System.out.println(n);
	} else {
		n = -1 * (size.length() - 2);
		System.out.println(n);
	}
	if (n < 0) {
		int tmp = x;
		x = y;
		y = tmp * 2;
		return paper(size + "0");
	} else if (n > 0) {
		return 1;
	} else {
		System.out.println("Dimensions: " + x + " x " + y);
		return 0;
	}
}
}

