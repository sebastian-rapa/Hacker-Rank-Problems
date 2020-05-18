package main.code.days_30.day_18;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> numberQueue = new Queue<>();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());

        Queue<String> stringQueue = new Queue<>();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("there");
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
    }
}
