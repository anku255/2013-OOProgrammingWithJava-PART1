/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Anku
 */
public class Person {
    
    private String name;
    private Education title;
    
    public Person(String name, Education title)
    {
        this.name = name;
        this.title = title;
    }
    
    public Education getEducation()
    {
        return this.title;
    }
    
    public String toString()
    {
        return this.name + ", " + this.getEducation();
    }
        
    
}
