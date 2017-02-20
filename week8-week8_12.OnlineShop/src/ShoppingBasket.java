
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class ShoppingBasket {
    
    private Map<String, Purchase> listOfPurchase;
    
    public ShoppingBasket()
    {
        this.listOfPurchase = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price)
    {
        if(this.listOfPurchase.containsKey(product))
            this.listOfPurchase.get(product).increaseAmount();
        else
            this.listOfPurchase.put(product, new Purchase(product, 1 , price));
    }
    
    public int price()
    {
        int totalPrice = 0;
        for(Purchase purchase : this.listOfPurchase.values())
        {
            totalPrice += purchase.price();
        }
        
        return totalPrice;
    }
    
    public void print()
    {
        for(Purchase purchase : this.listOfPurchase.values())
        {
            System.out.println(purchase);
        }
    }
    
}
