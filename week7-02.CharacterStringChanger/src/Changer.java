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

public class Changer {
    
    private ArrayList<Change> listOfChange;
    
    public Changer()
    {
        this.listOfChange = new ArrayList<Change>();
    }
    
    public void addChange(Change change)
    {
        this.listOfChange.add(change);
    }
    
    public String change(String characterString)
    {
        for(Change change : listOfChange)
        {
            characterString = change.change(characterString);
        }
        return characterString;
    }
    
}
