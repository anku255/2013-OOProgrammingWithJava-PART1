
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guessNo =0;
        while(true)
        {
            System.out.println("Guess a number: ");
            int num = Integer.parseInt(reader.nextLine());
            guessNo++;
            if(numberDrawn>num)
                System.out.println("The number is greater, guesses made: "+guessNo);
            else if(numberDrawn<num)
                System.out.println("The number is lesser, guesses made: "+guessNo);
            else
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
