package main.code.days_30.day_18;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem {
    private LinkedList<Character> queue;
    private LinkedList<Character> stack;
    // Write your code here.

    private char dequeueCharacter() {
        return queue.removeFirst();
    }

    private char popCharacter() {
        return stack.removeLast();
    }

    private void enqueueCharacter(char c) {
        if (null == queue)
            queue = new LinkedList<>();
        queue.addLast(c);
    }

    private void pushCharacter(char c) {
        if (null == stack)
            stack = new LinkedList<>();
        stack.addLast(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Problem p = new Problem();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
