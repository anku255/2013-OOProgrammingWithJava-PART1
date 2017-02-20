public class Printing {

    public static void printStars(int amount) {
        
        while(amount>0)
        {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int temp = sideSize;
        while(temp>0)
        {
            printStars(sideSize);
            temp--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        while(height>0)
        {
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int temp =1;
        while(temp<=size)
        {
            printStars(temp);
            temp++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        //printStars(3);
        //System.out.println("\n---");  // printing --- to separate the figures
        //printSquare(4);
        //System.out.println("\n---");
        //printRectangle(17, 3);
        //System.out.println("\n---");
        printTriangle(3);
        //System.out.println("\n---");
    }

}
