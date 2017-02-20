
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>(); 
        
        
        while(true)
        {
            System.out.println("name: ");
            String name = reader.nextLine();
            if(name.isEmpty())
                break;
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student student = new Student(name, studentNumber);
            list.add(student);
            
        }
        
        for(Student student : list)
        {
            
            System.out.println(student);
        }
        
        
            
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        
        System.out.println("Result: ");
        
        for(Student student : list)
        {
            if(student.getName().contains(term))
                System.out.println(student);
        }
    }
}