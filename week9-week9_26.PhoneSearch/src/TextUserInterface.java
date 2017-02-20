
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class TextUserInterface {
    
    private PhoneBook phoneBook = new PhoneBook();
    private Scanner reader  = new Scanner(System.in);
    
    public void start()
    {
        showMenu();
        String command = "";
        while(true)
        {
            System.out.println("");
            System.out.print("command: ");
            command = reader.nextLine();
            if(command.equals("x"))
                break;
            
            else if(command.equals("1"))
                addANumber();
            
            else if(command.equals("2"))
                searchForANumber();
            
            else if(command.equals("3"))
                searchNameByNumber();
            
            else if(command.equals("4"))
                addAddress();
            
            else if(command.equals("5"))
                getInformation();
            
            else if(command.equals("6"))
                deleteInformation();
            
            else if(command.equals("7"))
                filteredSearch();
                
        }
    }
    
    private void showMenu()
    {
       System.out.println("phone search\n" +
                            "available operations:\n" +
                            " 1 add a number\n" +
                            " 2 search for a number\n" +
                            " 3 search for a person by phone number\n" +
                            " 4 add an address\n" +
                            " 5 search for personal information\n" +
                            " 6 delete personal information\n" +
                            " 7 filtered listing\n" +
                            " x quit");
    }
    
    private void addANumber()
    {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        
        phoneBook.addNumber(name, number);
    }
    
    private void searchForANumber()
    {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        System.out.println("  "+phoneBook.getNumber(name));
    }
    
    private void searchNameByNumber()
    {
        System.out.print("number: ");
        String number = reader.nextLine();
        System.out.println("  " + this.phoneBook.getName(number));
    }
    
    private void addAddress()
    {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        
        this.phoneBook.addAddress(name, street+ " " + city);
    }
    
    private void getInformation()
    {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        System.out.println("  " + this.phoneBook.getInformation(name));
    }
    
    private void deleteInformation()
    {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.phoneBook.deleteInformation(name);
    }
    
    private void filteredSearch()
    {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        System.out.println("");
        ArrayList<Person> filteredList = this.phoneBook.filteredSearch(keyword);
        
        if(filteredList.isEmpty())
        {
            System.out.println(" keyword not found");
            return;
        }
        
        for(Person person : filteredList)
        {
            System.out.println(" " + person.getName());
            System.out.println("  " + this.phoneBook.getInformation(person.getName()));
        }
    }
}
