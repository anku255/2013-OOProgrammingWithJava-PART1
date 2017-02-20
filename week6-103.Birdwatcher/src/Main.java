import java.util.Scanner;

public class Main {

    public static String prompt(Scanner scanner, String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }
    
    public static void add(Scanner scanner, BirdDatabase db) {
        String name = prompt(scanner, "Name:");
        String latinName = prompt(scanner, "Latin Name:");
        db.addBird(name, latinName);
    }
    
    private static void observation(Scanner scanner, BirdDatabase db) {
        String name = prompt(scanner, "What was observed?");
        boolean success = db.observe(name);
        if (!success) {
            System.out.println("Is not a bird!");
        }
    }

    private static void statistics(Scanner scanner, BirdDatabase db) {
        System.out.println(db.statistics());        
    }

    private static void show(Scanner scanner, BirdDatabase db) {
        String name = prompt(scanner, "What?");
        String resp = db.show(name);
        if (resp == null) {
            System.out.println("Is not a bird!");            
        } else {
            System.out.println(resp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            String command = prompt(scanner, "?");
            
            if (command.equals("Add")) {
                add(scanner, db);
            } else if (command.equals("Observation")) {
                observation(scanner, db);
            } else if (command.equals("Statistics")) {
                statistics(scanner, db);
            } else if (command.equals("Show")) {
                show(scanner, db);
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}