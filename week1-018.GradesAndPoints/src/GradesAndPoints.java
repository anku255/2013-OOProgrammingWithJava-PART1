
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int point = Integer.parseInt(reader.nextLine());
        if(point<=29)
            System.out.println("failed");
        else if(point<=34)
            System.out.println("Grade: 1");
        else if(point<=39)
            System.out.println("Grade: 2");
        else if(point<=44)
            System.out.println("Grade: 3");
        else if(point<=49)
            System.out.println("Grade: 4");
        else if(point<=60)
            System.out.println("Grade: 5");

    }
}
