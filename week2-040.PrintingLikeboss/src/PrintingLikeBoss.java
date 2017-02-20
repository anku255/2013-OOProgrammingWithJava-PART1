public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0)
        {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0)
        {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int amount) {
        // 40.2
        int n = amount-1;
        int i=1;
        while(i<=amount)
        {
            printWhitespaces(n);
            printStars(i);
            i++;
            n--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int n = height-1;
        int i=1;
        int j =0;
        while(i<=height)
        {
            printWhitespaces(n);
            printStars(i+j);
            j++;
            i++;
            n--;
        }
        int k =0;
        while(k<2)
        {
            printWhitespaces(height-2);
            printStars(3);
            k++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(8);
    }
}
