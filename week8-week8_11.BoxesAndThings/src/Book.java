/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Book implements ToBeStored{
    
    private String name;
    private String writer;
    private double weight;
    
    public Book(String name, String writer , double weight)
    {
        this.name = name;
        this.weight = weight;
        this.writer = writer;
    }
    
    public double weight()
    {
        return this.weight;
    }
    
    @Override
    public String toString()
    {
        return this.name + ": " + this.writer;
    }
    
}
