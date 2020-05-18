package main.code.days_30.day_18;

import java.util.LinkedList;

public class Stacks<T> {

    private LinkedList<T> queue;

    public Stacks() {
        queue = new LinkedList<>();
    }

    public void push(T value) {
        queue.addLast(value);
    }

    public T push() {
        return queue.remove(
                queue.size() - 1
        );
    }

    public T peek() {
        return queue.get(
                queue.size() - 1
        );
    }
}
