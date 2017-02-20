
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Box implements ToBeStored{
    
    private double capacity;
    private ArrayList<ToBeStored> listOfItems;
    
    public Box(double capacity)
    {
        this.capacity = capacity;
        this.listOfItems = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item)
    {
        if((this.weight()+item.weight())<= this.capacity)
        {
            this.listOfItems.add(item);
            
        }
    }
    
    public String toString()
    {
        return "Box: " + this.listOfItems.size() + " things, total weight " + this.weight() + " kg";
    }
    
    public double weight()
    {
        double weight = 0;
        for(ToBeStored item : this.listOfItems)
            weight += item.weight();
        
        return weight;
    }
}
