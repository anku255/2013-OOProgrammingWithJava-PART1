
import java.util.HashSet;
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
public class Person {
    
    private String name;
    private Set<String> phoneNumbers;
    private String address;
    
    public Person(String name)
    {
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.address = "";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumbers(String number) {
        this.phoneNumbers.add(number);
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    
    
    
    
}
