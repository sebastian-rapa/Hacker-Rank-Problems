package main.code.days_30.day_15;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node insert(Node head, int data) {
        if (null == head)
            return new Node(data);

        Node currentNode = head;
        while (null != currentNode.next) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node(data);

        return head;
    }
}
