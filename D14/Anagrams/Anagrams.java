import java.util.*;

/**
 * Write a description of class Anagram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anagrams
{
    private static List<String> anagrams = new ArrayList();

    public static List<String> getAnagrams(String word) {
        List<String> list = new ArrayList();
        if (word.length() <= 1) {
            return list;
        } else {
            for (int i = 0; i < word.length(); i++) {
                
            }
        }
        anagrams.addAll(list);

        return anagrams;
    }

    static void printAnagrams(String prefix, String word) {
        if(word.length() <= 1) {
            System.out.println(prefix + word);
        } 
        else {
            for(int i = 0; i < word.length(); i++) {
                String current = word.substring(i, i + 1);
                String before = word.substring(0, i); // letters before cur
                String after = word.substring(i + 1); // letters after cur
                printAnagrams(prefix + current, before + after);
            }//end for( int i....
        }//end else
    }//end printAnagrams()
    
    public static void main( String[] args)
	  {
		  Scanner keyboard = new Scanner( System.in);
		  
		  System.out.print("Provide a word to anagram: ");
          String word = keyboard.nextLine();
          printAnagrams("", word);
      }
}
