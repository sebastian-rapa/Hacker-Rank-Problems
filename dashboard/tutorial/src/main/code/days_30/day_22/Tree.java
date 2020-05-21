package main.code.days_30.day_22;

public interface Tree<T extends Comparable<T>> {

    boolean isEmpty();

    int cardinality();

    boolean member(T element);

    NonEmptyBst<T> add(T element);
}
