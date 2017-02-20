
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
         
        if(obj==null || obj.getClass()!=this.getClass())
        {
            return false;
        }
        
        Bird other = (Bird) obj;
        
        if(other.latinName.equals(this.latinName) && other.ringingYear == this.ringingYear)
        {
            return true;
        }
        
        return false;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 97 * hash + this.ringingYear;
        return hash;
    }
}


