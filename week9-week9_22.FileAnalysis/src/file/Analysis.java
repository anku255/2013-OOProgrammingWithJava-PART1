/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Anku
 */
public class Analysis {
    
    private File file;
    private Scanner reader;
    
    public Analysis(File file)
    {
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException
    {
        reader = new Scanner(file);
        int noOfLines = 0;
        while(reader.hasNextLine())
        {
            noOfLines++;
            reader.nextLine();
        }
        
        return noOfLines;
    }
    
    public int characters() throws FileNotFoundException
    {
        reader = new Scanner(file);
        int noOfChars =0;
        while(reader.hasNextLine())
        {
            noOfChars += reader.nextLine().length() + 1;
        }
        return noOfChars;
    }
    
}
