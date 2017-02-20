/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Anku
 */
public class Cow implements Alive,Milkable{
    
    private String name;
    private double capacity;
    private double amount;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(String name)
    {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }
    
    public Cow()
    {
       this(NAMES[new Random().nextInt(NAMES.length)]);
    }

    public double getAmount() {
        return amount;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return this.getName() + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public void liveHour() {
         this.amount += 0.7 + new Random().nextDouble() * 1.3;
         
         if(amount>capacity)
             amount = capacity;
    }

    @Override
    public double milk() {
          double milk = this.getAmount();
          amount = 0;
          return milk;
    }
    
    
}
