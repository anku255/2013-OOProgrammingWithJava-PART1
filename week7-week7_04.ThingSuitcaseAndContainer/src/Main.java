public class Main {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase(20);
        suitcase.addThing(new Thing("Carrot", 2));
        suitcase.addThing(new Thing("Kaali", 8));
        suitcase.addThing(new Thing("Nauris", 4));
        Thing heaviest = suitcase.heaviestThing();
        System.out.println(heaviest);
    }
    
    public static void addSuitcasesFullOfBricks(Container container)
    {
        int weightOfBrick = 1;
        for(int i = 1; i<=100 ; i++)
        {
            Thing thing = new Thing("brick", weightOfBrick);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
            if(weightOfBrick<100)
                weightOfBrick++;
        }
    }
}