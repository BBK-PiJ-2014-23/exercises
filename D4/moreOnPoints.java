import java.util.Scanner;
public class moreOnPoints
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Creating a new point at (2, 2) and another point at (3, 3)");
Point p1 = new Point();
p1.x = 2;
p1.y = 2;
Point p2 = new Point();
p2.x = 3;
p2.y = 3;

System.out.print("Distance from Point 1 to Point 2: ");
System.out.println(p1.distanceTo(p2));

System.out.print("Distance from origin to Point 1: ");
System.out.println(p1.distanceToOrigin());

System.out.print("Moving point 2 to (4, 4). Actual new location: ");
p2.moveTo(4, 4);
System.out.println(p2.x + ", " + p2.y);

System.out.print("Moving point 1 to point 2. Actual new location: ");
p1.moveTo(p2);
System.out.println(p1.x + ", " + p1.y);

System.out.print("Creating new point as a copy of point 2. Location of point 3: ");
Point p3 = p2.duplicate();
System.out.println(p3.x + ", " + p3.y);

System.out.print("Creating new point as the opposite of Point 3. Location of point 4: ");
Point p4 = p3.opposite();
System.out.println(p4.x + ", " + p4.y);

}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
	
	double distanceTo(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	double distanceToOrigin() {
		return this.distanceTo(new Point());
	}
	
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	Point duplicate() {
		return this;
	}
	
	Point opposite() {
		Point opposed = new Point();
		opposed.x = - this.x;
		opposed.y = - this.y;
		return opposed;
	}
}
