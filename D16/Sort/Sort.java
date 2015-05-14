import java.io.*;
import java.util.*;
/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sort
{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            File currentDir = new File(".");
            File file = new File(currentDir, args[i]);
            BufferedReader in = null;
            ArrayList<String> allLines = null;
            try {
                in = new BufferedReader(new FileReader(file));
                allLines = new ArrayList<String>();
                String line;
                while ((line = in.readLine()) != null) {
                    allLines.add(line);
                }
                allLines.sort(String.CASE_INSENSITIVE_ORDER);
                for (String oneLine : allLines) {
                    System.out.println(oneLine);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File " + file.getName() + " not found.");
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                closeReader(in);
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
