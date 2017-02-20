import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int fact =1;
        while(n>0)
        {
            fact *= n;
            n--;
        }
        System.out.println("Factorial is " + fact);

    }
}
