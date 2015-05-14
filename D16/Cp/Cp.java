import java.io.*;
import java.util.*;
/**
 * Write a description of class Cp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cp
{
    public static void main(String[] args) {
        File currentDir = new File(".");
        File file1 = new File(currentDir, args[0]);
        File file2 = new File(currentDir, args[1]);
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new FileReader(file1));
            out = new PrintWriter(file2);
            String line;
            if (file2.exists()) {
                System.out.print("File " + file2.getName() + " exists. Overwrite? (y/n) ");
                Scanner sc = new Scanner(System.in);
                if (!sc.next().equals("y")) {
                    return;
                }
            }

            while ((line = in.readLine()) != null) {
                out.write(line);
                out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file1.getName() + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
            if (out != null) {
                out.close();
            }
        }
    }

    private static void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
