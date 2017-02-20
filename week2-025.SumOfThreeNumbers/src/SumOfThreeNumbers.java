
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        int n=3;
        while(n>0)
        {
            read = Integer.parseInt(reader.nextLine());
            sum += read;
            n--;
        }
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
