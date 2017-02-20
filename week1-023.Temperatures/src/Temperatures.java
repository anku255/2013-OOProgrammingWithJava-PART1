
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true) {
            double number = Double.parseDouble(reader.nextLine());
            if(number>=-30.00 && number<=40.00)
                Graph.addNumber(number);
        }

        // Graph is used as follows:
        
        // Remove or comment out these lines above before trying to run the tests.
        
    }
}