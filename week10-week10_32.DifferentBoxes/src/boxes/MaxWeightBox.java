/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anku
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private List<Thing> listOfThings;
    
    public MaxWeightBox(int maxWeight)
    {
        this.maxWeight = maxWeight;
        this.listOfThings = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int boxWeight = 0;
        for(Thing t : listOfThings)
        {
            boxWeight += t.getWeight();
        }
        
        boxWeight += thing.getWeight();
        
        if(boxWeight<=maxWeight)
        {
            this.listOfThings.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
         return this.listOfThings.contains(thing);
    }
    
    
    
}
