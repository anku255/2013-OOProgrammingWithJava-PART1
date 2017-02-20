/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Product {
    
   private String nameAtStart;
   private double priceAtStart;
   private int amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart)
    {
        this.amountAtStart = amountAtStart;
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
    }
    
    public void printProduct()
    {
        System.out.println(this.nameAtStart+ ", price " + this.priceAtStart + ", amount "+ this.amountAtStart);
    }
    
}
