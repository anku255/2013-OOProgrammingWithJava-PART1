
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        
    }
    
    private static void printWithSmileys(String characterString)
    {
        int lengthOfRow = calculateLenghtRow(characterString);
        printRow(lengthOfRow);
        printMiddleRow(characterString);
        printRow(lengthOfRow);
    }
    
    public static int calculateLenghtRow(String word)
    {
        if(word.length()%2==0)
            return word.length()+6;
        else
            return word.length()+7;
    }
    
    public static void printRow(int length)
    {
        for(int i =0; i<length/2 ; i++)
            System.out.print(":)");
        System.out.println("");
    }
    
    public static void printMiddleRow(String word)
    {
        System.out.print(":) ");
        if(word.length()%2==0)
            System.out.println(word + " :)");
        else
            System.out.println(word + "  :)");
    }

}
