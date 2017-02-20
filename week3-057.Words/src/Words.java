import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        while(!word.isEmpty())
        {
            words.add(word);
            System.out.println("Type a word:");
            word = reader.nextLine();
        }
        for(String text: words)
            System.out.println(text);
    }
}
