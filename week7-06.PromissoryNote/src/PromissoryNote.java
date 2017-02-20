
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
public class PromissoryNote {
    
    private HashMap<String,Double> listOfLoans;
    
    public PromissoryNote()
    {
        this.listOfLoans = new HashMap<String,Double>();
    }
    
    public void setLoan(String toWhom, double value )
    {
        this.listOfLoans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose)
    {
        if(this.listOfLoans.containsKey(whose))
            return this.listOfLoans.get(whose);
        
        return 0.0;
    }
}
