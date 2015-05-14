
/**
 * Write a description of class Patient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patient
{
    private String name;
    private int age;

    public Patient(String name, int age) throws IllegalArgumentException {
        this.name = name;
        if (age > 0 && age <= 130) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }
}