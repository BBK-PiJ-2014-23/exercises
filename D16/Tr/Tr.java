import java.io.*;
import java.util.*;
/**
 * Write a description of class Tr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tr
{
    public static void main(String[] args) {
        if (args.length == 3) {
            File currentDir = new File(".");
            File file = new File(currentDir, args[0]);
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    line = line.replace(args[1], args[2]);
                    System.out.println(line);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File " + file.getName() + " not found.");
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                closeReader(in);
            }
        } else {
            System.out.println("Invalid argument length.");
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