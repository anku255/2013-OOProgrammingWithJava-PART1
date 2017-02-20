/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anku
 */
public class Group implements Movable{
    
    private List<Movable> listOfOrganism = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable)
    {
        this.listOfOrganism.add(movable);
    }
    
    public String toString()
    {
        String toReturn = "";
        for(Movable movable : this.listOfOrganism)
        {
            toReturn += movable.toString() + "\n";
        }
        
        return toReturn;
    }

    @Override
    public void move(int dx, int dy) {
         
        for(Movable movable : this.listOfOrganism)
        {
            movable.move(dx, dy);
        }
    }
    
}
