package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Main {

    public static void main(String[] args) {
        RatingRegister rek = new RatingRegister();
        rek.addRating(new Person("Arto"), new Film("Rambo"), Rating.BAD);
    }

}
