import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String reverse = "";
        int n = text.length()-1;
        while(n>=0)
        {
            reverse += text.charAt(n);
                    n--;
        }
        return reverse;
    }

    public static boolean palindrome(String text) {
        // write code here
        if(text.equals(reverse(text)))
            return true;
        else
            return false;
                    
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
