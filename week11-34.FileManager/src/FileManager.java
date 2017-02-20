
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> temp = new ArrayList<String>();
        File newFile = new File(file);
        Scanner reader = new Scanner(newFile);
        while(reader.hasNextLine())
        {
            temp.add(reader.nextLine());
        }
        reader.close();
        return temp;
    }

    public void save(String file, String text) throws IOException {
        
        FileWriter write = new FileWriter(file,false);
        write.write(text);
        write.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter write = new FileWriter(file,false);
        
        for(String line : texts)
        {
            write.write(line + "\n");
        }
        
        write.close();
    }
}
