package main.code.days_30.day_18;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("there");
        stack.push("hi");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + "!");
    }
}
