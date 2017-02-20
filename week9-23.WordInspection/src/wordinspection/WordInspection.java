/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anku
 */
public class WordInspection {
    
    private File file;
    private Scanner reader;
    
    public WordInspection(File file)
    {
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException
    {
        int wordCount = 0;
        reader = new Scanner(file, "UTF-8");
        while(reader.hasNext())
        {
            wordCount++;
            reader.next();
        }
        
        return wordCount;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException
    {
        List<String> list = new ArrayList<String>();
        reader = new Scanner(file,"UTF-8");
        
        while(reader.hasNext())
        {
            String word = reader.next();
            if(word.indexOf("z") != -1)
                list.add(word);
        }
        
        return list;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsWithL = new ArrayList<String>();
        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            if(word.charAt(word.length() - 1) == 'l')
                wordsWithL.add(word);
        }
        return wordsWithL;
    }
    
    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> palindrom = new ArrayList<String>();
        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            StringBuilder builder = new StringBuilder();
            builder.append(word);
            builder = builder.reverse();
            String reverse = new String(builder);
            if(word.equals(reverse))
                palindrom.add(word);
        }
        return palindrom;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> vowels = new ArrayList<String>();
        char[] array = {'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};
        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            int count = 0;
            for(int i = 0; i < array.length; i++){
                if(word.indexOf(array[i]) != -1) {
                    count++;
                }
            }
            if(count == 8)
                vowels.add(word);
        }
        return vowels;
    }
}
