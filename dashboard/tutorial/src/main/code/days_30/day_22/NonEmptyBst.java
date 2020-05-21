package main.code.days_30.day_22;

public class NonEmptyBst<T extends Comparable<T>> implements Tree<T> {

    private T root;
    private Tree<T> left;
    private Tree<T> right;

    public NonEmptyBst(T element) {
        this.root = element;
        this.left = new EmptyBST<>();
        this.right = new EmptyBST<>();
    }

    public NonEmptyBst(T element, Tree<T> left, Tree<T> right) {
        this.root = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(T element) {
        if (root == element)
            return true;
        if (element.compareTo(root) < 0)
            return left.member(element);
        else
            return right.member(element);
    }

    @Override
    public NonEmptyBst<T> add(T element) {
        if (element == root)
            return this;
        if (element.compareTo(root) < 0)
            return new NonEmptyBst<>(root, left.add(element), right);
        else
            return new NonEmptyBst<>(root, left, right.add(element));
    }
}
