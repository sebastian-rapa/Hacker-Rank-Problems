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
}
