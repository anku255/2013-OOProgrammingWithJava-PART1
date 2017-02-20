
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum =0;
        while(n>0)
        {
            sum+=n;
            n--;
        }
        System.out.println("Sum is "+ sum);

    }
}
