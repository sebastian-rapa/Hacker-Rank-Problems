package main.code.algorithms;

class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x2 > x1 && v2 > v1 || x2 < x1 && v2 < v1) {
            return "NO";
        }

        int maxIntSize = (int) Math.pow(2,32) - 1;
        while (true) {
            if ((long)x1 + v1 > maxIntSize)
                return "NO";
            if ((long)x2 + v2 > maxIntSize)
                return "NO";
            x1 += v1;
            x2 += v2;
            if (x1 == x2)
                return "YES";
        }
    }
}
