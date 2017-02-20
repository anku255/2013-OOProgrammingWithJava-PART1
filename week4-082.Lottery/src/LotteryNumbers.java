import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        int i =0;
        while(i<7)
        {
            int number = random.nextInt(39) + 1;
            if(!containsNumber(number))
            {
                numbers.add(number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
