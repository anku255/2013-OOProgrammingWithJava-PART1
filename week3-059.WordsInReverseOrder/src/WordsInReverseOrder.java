import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while(true)
        {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty())
                break;
            else
                words.add(word);
        }
        System.out.println("You typed the following words:");
        int n = words.size()-1;
        while(n>=0)
        {
            System.out.println(words.get(n));
            n--;
        }
    }
}
