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

public class Container {
    
    private ArrayList<Suitcase> listOfSuitcase;
    private int weightLimit;
    private int weightNow;
    
    public Container(int limit)
    {
        this.weightLimit = limit;
        this.weightNow = 0;
        this.listOfSuitcase = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase)
    {
        if((this.weightNow + suitcase.totalWeight()) <= this.weightLimit)
        {
            this.listOfSuitcase.add(suitcase);
            this.weightNow += suitcase.totalWeight();
        }
            
    }
    
    public String toString()
    {
        return this.listOfSuitcase.size() + " suitcases (" + this.weightNow +" kg)";
    }
    
    public void printThings()
    {
        
        for(Suitcase suitcase : this.listOfSuitcase)
        {
            suitcase.printThings();
        }
    }
    
}
