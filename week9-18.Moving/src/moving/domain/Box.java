/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author Anku
 */
public class Box implements Thing{
    
    private int capacity;
    private ArrayList<Thing> listOfItem;
    
    public Box(int capacity)
    {
        this.capacity = capacity;
        this.listOfItem = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing)
    {
        if((this.getVolume()+thing.getVolume())<= this.capacity)
        {
            this.listOfItem.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        
        int vol = 0;
        for(Thing thing : this.listOfItem)
            vol += thing.getVolume();
        
        return vol;
    }
    
}
