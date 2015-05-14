import java.io.*;
import java.util.*;
/**
 * Write a description of class Uniq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uniq
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
                    boolean isDupe = false;
                    for (String oneLine : allLines) {
                        if (oneLine.equals(line)) {
                            isDupe = true;
                        }
                    }
                    if (!isDupe) {
                        allLines.add(line);
                    }
                }
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
