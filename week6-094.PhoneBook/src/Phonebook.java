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

public class Phonebook {
    
    private ArrayList<Person> personList;
    
    public Phonebook()
    {
        this.personList = new ArrayList<Person>();
    }
    
    public void add(String name, String number)
    {
        this.personList.add(new Person(name, number));
    }
    
    public void printAll()
    {
        for(Person person: this.personList)
        {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name)
    {
        for(Person person : this.personList)
        {
            if(person.getName().contains(name))
                return person.getNumber();
        }
        return "number not known";
    }
}
