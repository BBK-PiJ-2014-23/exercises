import java.io.*;
/**
 * Write a description of class TemperatureAverages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TemperatureAverages
{
    public static void main(String[] args) {
        File file = new File("./temperatures.csv");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            int sumAll = 0;
            int counterAll = 0;
            int sumLine = 0;
            int lineNumber = 1;
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineSplit = line.split(", ");
                for (int i = 0; i < lineSplit.length; i++) {
                    sumLine += Integer.parseInt(lineSplit[i]);
                }
                System.out.println("The average for line " + lineNumber + " is " + (sumLine / lineSplit.length));
                sumAll += sumLine;
                counterAll += lineSplit.length;
                sumLine = 0;
                lineNumber++;
            }            
            System.out.println("The average for the file is " + (sumAll / counterAll));
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file.getName() + " not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
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