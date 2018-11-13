package fr.laerce.cinema;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FilmComparator implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        return 0;
    }

    @Override
    public Comparator<Film> reversed() {
        return null;
    }

    @Override
    public Comparator<Film> thenComparing(Comparator<? super Film> other) {
        return null;
    }

    @Override
    public <U> Comparator<Film> thenComparing(Function<? super Film, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Film> thenComparing(Function<? super Film, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Film> thenComparingInt(ToIntFunction<? super Film> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Film> thenComparingLong(ToLongFunction<? super Film> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Film> thenComparingDouble(ToDoubleFunction<? super Film> keyExtractor) {
        return null;
    }
}
