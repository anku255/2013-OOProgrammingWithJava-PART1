import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum =0,count = 0,even =0, odd =0;
        double avg = 0.0;
        System.out.println("Type numbers: ");
        int n = Integer.parseInt(reader.nextLine());
        while(n!=-1)
        {
            
            sum+=n;
            if(n%2==0)
                even+=1;
            else
                odd +=1;
            count+=1;
            n = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+count);
        System.out.println("Average: "+sum/(double)count);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);

    }
}
