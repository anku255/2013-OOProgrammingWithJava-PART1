
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int s = Integer.parseInt(reader.nextLine());
        int e = Integer.parseInt(reader.nextLine());
        int sum =0;
        while(s<=e)
        {
            sum+=s;
            s++;
        }
        System.out.println("The sum "+sum);
    }
}
