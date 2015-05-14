import java.io.*;
/**
 * Write a description of class Ls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ls
{
    public static void main(String[] args) {
        File currentDir = new File(".");
        String[] list = currentDir.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
