/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */

import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary)
    {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start()
    {
        System.out.println("Statements: ");
        System.out.println("    add - add a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the next user interface");
        
        String command = "";
        
        while(true)
        {
            System.out.println("Statement: ");
            command = this.reader.nextLine();
            
            if(command.equals("quit"))
                break;
            else if(command.equals("add"))
            {
                System.out.print("In Finnish: ");
                String inFinnish = this.reader.nextLine();
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                
                this.dictionary.add(inFinnish, translation);
            }
            
            else if (command.equals("translate"))
            {
                System.out.print("Give a Word: ");
                String word = this.reader.nextLine();
                System.out.println(this.dictionary.translate(word));
            }
            
            else
                System.out.println("Unknown statement");
        }
    }
    
}
