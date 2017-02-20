
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
public class PhoneBook {
    
    private Map<String,Person> mapOfNameWithPerson = new HashMap<String,Person>();
    private Map<Set<String>,String> mapOfNumberWithName = new HashMap<Set<String>,String>();
    
    public void addNumber(String name, String number)
    {
        if(!this.mapOfNameWithPerson.containsKey(name))
        {
            this.mapOfNameWithPerson.put(name, new Person(name));
        }
        if(this.mapOfNumberWithName.containsKey(this.mapOfNameWithPerson.get(name).getPhoneNumbers()))
        {
            this.mapOfNumberWithName.remove(this.mapOfNameWithPerson.get(name).getPhoneNumbers());
        }
        this.mapOfNameWithPerson.get(name).setPhoneNumbers(number);
        
        
        this.mapOfNumberWithName.put(this.mapOfNameWithPerson.get(name).getPhoneNumbers(), name);
        
    }
    
    public void addAddress(String name, String address)
    {
        if(!this.mapOfNameWithPerson.containsKey(name))
        {
            this.mapOfNameWithPerson.put(name, new Person(name));
        }
        
        this.mapOfNameWithPerson.get(name).setAddress(address);
    }
    
    public String getNumber(String name)
    {
        if(!this.mapOfNameWithPerson.containsKey(name))
            return "not found";
        
        Set<String> set = this.mapOfNameWithPerson.get(name).getPhoneNumbers();
        
        if(set.isEmpty())
            return "";
        
        String Number = "";
        for(String number : set)
        {
            Number += number + "\n" + "  ";
        }
        
        return Number;
    }
    
    public String getName(String number)
    {
        for(Set set : this.mapOfNumberWithName.keySet())
        {
            if(set.contains(number))
            {
                return this.mapOfNumberWithName.get(set);
            }
        }
        
        return "not found";
    }
    
    public String getInformation(String name)
    {
        String information = "";
        
        if(!this.mapOfNameWithPerson.containsKey(name))
            return "not found";
        
        if(this.mapOfNameWithPerson.get(name).getAddress().isEmpty())
            information += "address unknown" + "\n";
        else
            information += "address: " + this.mapOfNameWithPerson.get(name).getAddress() + "\n";
        
        String number = this.getNumber(name);
        if(number.isEmpty())
            information += "  " + "phone number not found" + "\n";
        else
        {
            information += "  phone numbers:" + "\n" + "  " + number;
        }
        
        return information;
    }
    
    public void deleteInformation(String name)
    {
        if(this.mapOfNameWithPerson.containsKey(name))
        {
            Person person = this.mapOfNameWithPerson.get(name);
            
            this.mapOfNumberWithName.remove(person.getPhoneNumbers());
            this.mapOfNameWithPerson.remove(name);
        }
    }
    
    public ArrayList<Person>  filteredSearch(String keyword)
    {
        ArrayList<String> listOfPerson = new ArrayList<String>();
        for(String person : this.mapOfNameWithPerson.keySet())
        {
            listOfPerson.add(person);
        }
        
        Collections.sort(listOfPerson);
        
        ArrayList<Person> filterdList = new ArrayList<Person>();
        
        for(String name : listOfPerson)
        {
            Person person = this.mapOfNameWithPerson.get(name);
            if(name.contains(keyword) || person.getAddress().contains(keyword))
            {
                filterdList.add(person);
            }
        }
        
        return filterdList;
    }
        
    
}
