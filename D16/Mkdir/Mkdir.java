import java.io.*;
/**
 * Write a description of class Mkdir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mkdir
{
    public static void main(String[] args) {
        File currentDir = new File(".");
        for (int i = 0; i < args.length; i++) {
            File newDir = new File(currentDir, args[i]);
            if (!newDir.exists()) {
                newDir.mkdir();
            } else {
                System.out.println("Directory " + args[i] + " already exists.");
            }
        }
    }
}
