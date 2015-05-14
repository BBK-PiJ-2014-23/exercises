import java.util.Scanner;
public class integer
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Integer2 i2 = new Integer2();
System.out.print("Enter a number: ");
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
System.out.print("The number you entered is ");
if (i2.isEven()) {
	System.out.println("even.");
} else if (i2.isOdd()) {
	System.out.println("odd.");
} else {
	System.out.println("undefined!! Your code is buggy!");
}
int parsedInt = Integer.parseInt(i2.toString2());
if (parsedInt == i2.getValue()) {
	System.out.println("Your toString() method seems to work fine.");
}

}}

class Integer2 {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	int value;
	
	int getValue() {
		return value;
	}
	
	void setValue(int x) {
		value = x;
	}
	
	boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	void prettyPrint() {
		System.out.print(value);
	}
	
	String toString2() {
		return Integer.toString(value);
	}
}
