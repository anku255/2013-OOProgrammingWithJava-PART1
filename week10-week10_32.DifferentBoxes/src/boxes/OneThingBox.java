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
public class OneThingBox extends Box{
    
    private List<Thing> listOfThing = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        if(listOfThing.isEmpty())
        {
            listOfThing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
         return listOfThing.contains(thing);
    }
    
    
    
}
