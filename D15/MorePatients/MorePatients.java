import java.util.*;
/**
 * Write a description of class MorePatients here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MorePatients
{
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<Patient>();
        System.out.print("Enter new patient's name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Enter new patient's age: ");
        int age = sc.nextInt();
        try {
            list.add(new Patient(name, age));
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid age");
        }
    }
}