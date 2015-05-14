import java.util.Scanner;
public class insideOrOutside
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter x and y coordinates of two points defining a rectangle:");

Rectangle rectangle = new Rectangle();
rectangle.upLeft = new Point();
rectangle.upLeft.x = Double.parseDouble(System.console().readLine());
rectangle.upLeft.y = Double.parseDouble(System.console().readLine());
rectangle.downRight = new Point();
rectangle.downRight.x = Double.parseDouble(System.console().readLine());
rectangle.downRight.y = Double.parseDouble(System.console().readLine());

System.out.println("Please enter x and y coordinates of a third point:");
Point point = new Point();
point.x = Double.parseDouble(System.console().readLine());
point.y = Double.parseDouble(System.console().readLine());

String result = "";

if (point.x <= rectangle.downRight.x && point.x >= rectangle.upLeft.x &&
    point.y <= rectangle.upLeft.y && point.y >= rectangle.downRight.y) {
	result = "inside";
} else {
	result = "outside";
}
System.out.println("The third point is " + result + " of the rectangle.");
}}

