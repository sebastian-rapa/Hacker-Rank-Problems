package main.code.algorithms;

class DrawingBook {

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        if (n == p) return 0;

        if (p % 2 == 1) p -= 1;

        return Math.min(
                (1 + p) / 2,
                (n - p) / 2
        );
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
        System.out.println(pageCount(19, 10));
        System.out.println(pageCount(6,5));
        System.out.println(pageCount(2,1));
    }
}
