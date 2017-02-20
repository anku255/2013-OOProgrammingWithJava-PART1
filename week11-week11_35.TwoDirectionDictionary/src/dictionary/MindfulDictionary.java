/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Anku
 */
public class MindfulDictionary {

    private Map<String, String> dictionary = new HashMap<String, String>();
    private String file;

    public MindfulDictionary(String file) {
        this.file = file;
    }

    public MindfulDictionary() {

    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        String translation = null;

        if (dictionary.containsKey(word)) {
            translation = dictionary.get(word);
        } else {
            for (Map.Entry<String, String> obj : dictionary.entrySet()) {
                if (obj.getValue().equals(word)) {
                    translation = obj.getKey();
                }
            }
        }

        return translation;
    }

    public void remove(String word) {
        String key = "";
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else {
            for (Map.Entry<String, String> obj : dictionary.entrySet()) {
                if (obj.getValue().equals(word)) {
                    key = obj.getKey();
                }
            }
            dictionary.remove(key);
        }
    }

    public boolean load() {
        Scanner reader = null;

        try {
            reader = new Scanner(new File(file));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] arr = line.split(":");
                this.add(arr[0], arr[1]);
            }
        } catch (FileNotFoundException ex) {
            return false;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return true;
    }

    public boolean save() {
        FileWriter writer = null;

        try {
            writer = new FileWriter(new File(file));
            for (String key : dictionary.keySet()) {
                String line = key + ":" + dictionary.get(key) + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            return false;
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    //do nothing
                }
            }
        }

        return true;
    }

}
