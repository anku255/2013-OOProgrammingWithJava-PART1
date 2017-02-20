
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int start = Integer.parseInt(reader.nextLine());
        int end  = Integer.parseInt(reader.nextLine());
        while(start<=end)
        {
            System.out.println(start);
            start++;
        }
                

    }
}
