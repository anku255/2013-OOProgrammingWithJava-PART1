/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Dmitry
 */
public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {

        Film recommended = null;
        Map<Film, List<Rating>> filmRating = register.filmRatings();
        List<Film> films = new ArrayList<Film>(filmRating.keySet());
        Collections.sort(films, new FilmComparator(filmRating));

        Map<Film, Rating> personalList = register.getPersonalRatings(person);

        for (int i = 0; i < films.size(); i++) {
            if (!personalList.containsKey(films.get(i))) {
                recommended = films.get(i);
                if (recommended != null) {
                    return recommended;
                }
            }

        }

        return recommended;

    }

}
