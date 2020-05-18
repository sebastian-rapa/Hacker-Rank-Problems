package main.code.days_30.day_18;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    // Is our queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // What is the size of our queue
    public int size () {
        return queue.size();
    }

    public void enqueue(T n) {
        queue.addLast(n);
    }

    public T dequeue() {
        return queue.remove(0);
    }

    public T peek() {
        return queue.get(0);
    }
}
