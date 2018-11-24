package fr.laerce.cinema;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

// Classe technique non-utilisée dans la version finale du projet, choix d'implémentation via une expression lambda

public class FilmComparatorAsc implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        return o1.titre.compareToIgnoreCase(o2.titre);
    }

}
