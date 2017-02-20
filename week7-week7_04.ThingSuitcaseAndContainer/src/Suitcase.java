/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> listOfThings;
    private int weightLimit;
    private int weightNow;

    public Suitcase(int limit) {
        this.listOfThings = new ArrayList<Thing>();
        this.weightLimit = limit;
        this.weightNow = 0;

    }

    public void addThing(Thing thing) {
        if ((this.weightNow + thing.getWeight()) <= this.weightLimit) {
            this.listOfThings.add(thing);
            this.weightNow += thing.getWeight();

        }

    }

    public String toString() {
        if (this.listOfThings.size() == 0) {
            return "empty (0 kg)";
        }

        if (this.listOfThings.size() == 1) {
            return "1 thing (" + this.weightNow + " kg)";
        }
        return this.listOfThings.size() + " things (" + this.weightNow + " kg)";
    }

    public void printThings() {
        //System.out.println("Your suitcase contains the following things: ");
        for (Thing thing : this.listOfThings) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return this.weightNow;
    }

    public Thing heaviestThing() {
        if (this.listOfThings.size() > 0) {
            int maxWeight = 0;
            Thing heaviestThing = this.listOfThings.get(0);
            for (Thing thing : this.listOfThings) {
                if (thing.getWeight() > maxWeight) {
                    maxWeight = thing.getWeight();
                    heaviestThing = thing;
                }
            }

            return heaviestThing;
        }
        return null;
    }

}
