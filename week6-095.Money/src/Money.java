
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added)
    {
        return new Money(this.euros()+added.euros(), this.cents()+added.cents());
    }
    
    public boolean less(Money compared)
    {
        if(this.euros()==compared.euros())
            return this.cents()<compared.cents();
        return this.euros()<compared.euros();
    }
    
    public Money minus(Money decremented) {
        int euroDifference = euros - decremented.euros();
        int centDifference = cents - decremented.cents();
 
        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }
 
        if (euroDifference < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDifference, centDifference);
    }
}

