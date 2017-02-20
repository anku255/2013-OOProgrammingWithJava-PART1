import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name)
    {
        
        this(name,Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int tDay = Calendar.getInstance().get(Calendar.DATE);
        int tMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int tYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate currentDate = new MyDate(tDay, tMonth, tYear);
        return currentDate.differenceInYears(this.birthday) ;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
         if(this.age()==compared.age())
         {
             return this.birthday.earlier(compared.birthday);
                
         }
         return this.age()>compared.age();
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    
}
