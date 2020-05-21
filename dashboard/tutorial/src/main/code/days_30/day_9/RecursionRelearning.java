package main.code.days_30.day_9;

public class RecursionRelearning {

    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + factorial(5));
        System.out.println("Exponential(2,4) = " + exponential(2,4));
    }

    public static long summation (long n) {

        if (n == 1) return 1;

        return n + summation(n - 1);
    }

    public static long factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static long exponential(int n, int p) {
        if (p == 1) return n;

        return n * exponential(n, p - 1);
    }
}
