

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array)
    {
        int[] copy = new int[array.length];
        for(int i = 0; i<copy.length; i++)
            copy[i] = array[i];
        return copy;
    }
    
    public static int[] reverseCopy(int[] array)
    {
        int[] copy = new int[array.length];
        for(int i = 0; i<copy.length; i++)
            copy[i] = array[copy.length-i-1];
        return copy;
    }
    
}
