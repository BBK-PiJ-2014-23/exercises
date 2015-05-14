import java.util.Scanner;
public class distancePoint2Point
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter the x and y coordinates of three points:");
Point p1 = new Point();
p1.x = Double.parseDouble(System.console().readLine());
p1.y = Double.parseDouble(System.console().readLine());
Point p2 = new Point();
p2.x = Double.parseDouble(System.console().readLine());
p2.y = Double.parseDouble(System.console().readLine());
Point p3 = new Point();
p3.x = Double.parseDouble(System.console().readLine());
p3.y = Double.parseDouble(System.console().readLine());

double p1ToP2 = Math.sqrt(Math.pow(p2.x - p1.x ,2)  + Math.pow(p2.y - p1.y, 2));
double p2ToP3 = Math.sqrt(Math.pow(p3.x - p2.x ,2)  + Math.pow(p3.y - p2.y, 2));
double p3ToP1 = Math.sqrt(Math.pow(p1.x - p3.x ,2)  + Math.pow(p1.y - p3.y, 2));

String result = "";
if (p1ToP2 < p2ToP3 && p1ToP2 < p3ToP1) {
	result = "Point 1 and Point 2";
} else if (p2ToP3 < p1ToP2 && p2ToP3 < p3ToP1) {
	result = "Point 2 and Point 3";
} else {
	result = "Point 1 and Point 3";
}
System.out.println(result + " are the points closest together.");

}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}
