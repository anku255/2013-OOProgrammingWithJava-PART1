/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class StringUtils {
    
    public static boolean included(String word, String searched)
    {
        word= word.trim();
        searched = searched.trim();
        word = word.toLowerCase();
        searched = searched.toLowerCase();
        return word.contains(searched);
    }
    
}
