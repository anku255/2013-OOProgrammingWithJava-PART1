
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Storehouse {
    
    private Map<String,Integer> listWithPrice;
    private Map<String, Integer> listWithStock;

    public Storehouse() {
        this.listWithPrice = new HashMap<String,Integer>();
        this.listWithStock = new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price, int stock)
    {
        this.listWithPrice.put(product, price);
        this.listWithStock.put(product, stock);
    }
    
    public int price(String product)
    {
        if(this.listWithPrice.containsKey(product))
            return this.listWithPrice.get(product);
        
        return -99;
    }
    
    public int stock(String product)
    {
        if(!this.listWithStock.containsKey(product))
            return 0;
        return this.listWithStock.get(product);
    }
    
    public boolean take(String product)
    {
        if((!this.listWithStock.containsKey(product)) || (this.listWithStock.get(product)==0))
            return false;
        
        this.listWithStock.put(product, listWithStock.get(product)-1);
        return true;
        
    }
    
    
    public Set<String> products()
    {
        return this.listWithPrice.keySet();
    }
}
