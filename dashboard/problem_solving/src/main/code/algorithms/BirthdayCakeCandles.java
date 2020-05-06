package main.code.algorithms;

import java.util.HashMap;
import java.util.Map;

class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        Map<Integer, Integer> candlesMap = new HashMap<>();

        int max = -1;
        for (int i : ar) {
            if (max < i)
                max = i;
        }


        for (int candleHeight : ar) {
            if (candlesMap.containsKey(candleHeight)){

                candlesMap
                        .computeIfPresent(candleHeight,
                            (key, value) -> value++
                        );
            } else {
                candlesMap.put(candleHeight, 1);
            }
        }

        return candlesMap.get(max);
    }

}

