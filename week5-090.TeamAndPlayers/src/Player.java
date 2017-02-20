/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Player {
    
    private String name;
    private int noOfGoals;
    
    public Player(String name, int noOfGoals)
    {
        this.name = name;
        this.noOfGoals = noOfGoals;
    }
    
    public Player(String name)
    {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public int getNoOfGoals() {
        return noOfGoals;
    }
    
    public int goals()
    {
        return noOfGoals;
    }
    
    
    public String toString()
    {
        return this.getName() + ", goals " + this.getNoOfGoals();
    }
    
    
    
    
}
