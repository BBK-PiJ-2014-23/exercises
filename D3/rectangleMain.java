import java.util.Scanner;
public class rectangleMain
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter x and y coordinates of two points:");

Rectangle rectangle = new Rectangle();
rectangle.upLeft = new Point();
rectangle.upLeft.x = Double.parseDouble(System.console().readLine());
rectangle.upLeft.y = Double.parseDouble(System.console().readLine());
rectangle.downRight = new Point();
rectangle.downRight.x = Double.parseDouble(System.console().readLine());
rectangle.downRight.y = Double.parseDouble(System.console().readLine());

double sideA = rectangle.downRight.x - rectangle.upLeft.x;
double sideB = rectangle.upLeft.y - rectangle.downRight.y;

double perimeter = 2 * sideA + 2 * sideB;
double area = sideA * sideB;

System.out.println("The square resulting from your two points has a perimeter of " + perimeter + " and and area of " + area + ".");

}}

class Rectangle {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	Point upLeft;
	Point downRight;
}
