import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public boolean observe(String name) {
        Bird bird = findBirdByName(name);
        
        if (bird == null) {
            return false;
        }
        
        bird.observe();
        return true;
    }

    public String show(String name) {
        Bird bird = findBirdByName(name);
        
        if (bird == null) {
            return null;
        }
        
        return bird.toString();
    }

    public String statistics() {
        String stats = "";
        for (Bird bird : this.birds) {
            stats += bird.toString() + "\n";
        }
        return stats;
    }

    private Bird findBirdByName(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

}