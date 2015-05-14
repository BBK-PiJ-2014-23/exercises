import java.util.Scanner;
public class hanoiTowers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(hanoiTowers(6));

} private static int hanoiTowers(int discs) {
	int moves = 0;
	if (discs == 3) {
		return 7;
	} else {
		return 2 * hanoiTowers(discs - 1) + 1;
	}
}
}

