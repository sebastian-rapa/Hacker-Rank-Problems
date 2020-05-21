package main.code.days_30.day_22;

public class EmptyBST<T extends Comparable<T>> implements Tree<T> {



    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(T element) {
        return false;
    }

    @Override
    public NonEmptyBst<T> add(T element) {
        return new NonEmptyBst<>(element);
    }
}
