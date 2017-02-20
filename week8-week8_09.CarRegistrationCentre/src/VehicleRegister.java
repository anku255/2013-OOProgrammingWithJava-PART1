
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate,String> owners = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner)
    {
        if(this.owners.containsKey(plate))
            return false;
        
        this.owners.put(plate,owner);
        return true;
    }
    
    public String get(RegistrationPlate plate)
    {
        if(!this.owners.containsKey(plate))
            return null;
        
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate)
    {
        if(!this.owners.containsKey(plate))
            return false;
        
        this.owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates()
    {
        for(RegistrationPlate plate : this.owners.keySet())
            System.out.println(plate);
    }
    
    public void printOwners()
    {
        String print ="";
        for(RegistrationPlate plate : this.owners.keySet())
        {
            if(!print.contains(this.owners.get(plate)))
                print = print + this.owners.get(plate) + "\n" ;
        }
        System.out.println(print);
            
    }
}
