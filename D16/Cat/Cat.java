import java.io.*;
/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat
{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            File currentDir = new File(".");
            File file = new File(currentDir, args[i]);
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
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
