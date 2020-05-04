package main.code.algorithms;

import java.util.ArrayList;
import java.util.List;

class SockMerchant {


    // This is a method call example sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
    // Complete the sockMerchant function below.
    @SuppressWarnings("Duplicates")
    static int sockMerchant(int n, int[] ar) {

        int numberOfPairs = 0;
        List<Integer> matchPair = new ArrayList<>();
        int color;
        new ArrayList<>();
        for (int i = 0; i < n; i++) {
            color = ar[i];
            if (matchPair.contains(color)) {
                matchPair.remove(Integer.valueOf(color));
                numberOfPairs++;
            } else {
                matchPair.add(color);
            }
        }

        return numberOfPairs;
    }
}
