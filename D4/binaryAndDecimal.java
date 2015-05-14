import java.util.Scanner;
public class binaryAndDecimal
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please enter (1) for binary to decimal conversion or (2) for decimal to binary conversion: ");
String str = System.console().readLine();
if (str.equals("1")) {
	System.out.print("Please enter a binary: ");
	str = System.console().readLine();
	System.out.println(binary2decimal(str));
} else if (str.equals("2")) {
	System.out.print("Please enter a decimal: ");
	int num = Integer.parseInt(System.console().readLine());
	System.out.println(decimal2binary(num));
} else {
	System.out.println("Invalid input");
}
	

} private static int binary2decimal(String binary) {
	int decimal = 0;
	for (int i = 0; i < binary.length(); i++) {
		int temp = Integer.parseInt(binary.substring(i, i + 1));
		if (temp == 1) {
			decimal += Math.pow(2, binary.length() - 1 - i);
		}
	}
	return decimal;
}

static String decimal2binary(int decimal) {
	String temp = "";
	while (decimal > 0) {
		if (decimal % 2 == 1) {
			temp += "1";
		} else {
			temp += "0";
		}
		decimal /= 2;
	}
	String binary = "";
	for (int i = temp.length() - 1; i >= 0; i--) {
		binary += temp.charAt(i);
	}
	return binary;
}
}

