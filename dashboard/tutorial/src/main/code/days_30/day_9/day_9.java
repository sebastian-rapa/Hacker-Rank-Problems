package main.code.days_30.day_9;

class day_9 {
    static int factorial(int n) {
        return n != 1 ?
                n * factorial(n - 1) :
                1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
