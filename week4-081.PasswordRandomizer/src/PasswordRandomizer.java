import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length= length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int n = 0;
        String password = "";
        while(n<this.length)
        {
            password += "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            n++;
        }
        return password;
    }
}
