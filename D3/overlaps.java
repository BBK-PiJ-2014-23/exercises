import java.util.Scanner;
public class overlaps
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter x and y coordinates of two points defining a rectangle:");
Rectangle rect1 = new Rectangle();
rect1.upLeft = new Point();
rect1.upLeft.x = Double.parseDouble(System.console().readLine());
rect1.upLeft.y = Double.parseDouble(System.console().readLine());
rect1.downRight = new Point();
rect1.downRight.x = Double.parseDouble(System.console().readLine());
rect1.downRight.y = Double.parseDouble(System.console().readLine());

System.out.println("Please enter x and y coordinates of two points defining another rectangle:");
Rectangle rect2 = new Rectangle();
rect2.upLeft = new Point();
rect2.upLeft.x = Double.parseDouble(System.console().readLine());
rect2.upLeft.y = Double.parseDouble(System.console().readLine());
rect2.downRight = new Point();
rect2.downRight.x = Double.parseDouble(System.console().readLine());
rect2.downRight.y = Double.parseDouble(System.console().readLine());


System.out.println("Please enter x and y coordinates of a fifth point:");
Point point = new Point();
point.x = Double.parseDouble(System.console().readLine());
point.y = Double.parseDouble(System.console().readLine());

String result = "";

if (point.x <= rect1.downRight.x && point.x >= rect1.upLeft.x &&
    point.y <= rect1.upLeft.y && point.y >= rect1.downRight.y &&
	point.x <= rect2.downRight.x && point.x >= rect2.upLeft.x &&
    point.y <= rect2.upLeft.y && point.y >= rect2.downRight.y) {
	result = "inside both rectangles";
} else if (point.x <= rect1.downRight.x && point.x >= rect1.upLeft.x &&
    point.y <= rect1.upLeft.y && point.y >= rect1.downRight.y) {
	result = "inside the first rectangle";
} else if (point.x <= rect2.downRight.x && point.x >= rect2.upLeft.x &&
    point.y <= rect2.upLeft.y && point.y >= rect2.downRight.y) {
	result = "inside the second rectangle";
} else {
	result = "outside both rectangles.";
}
System.out.println("The fifth point is " + result + ".");
}}

