package main.code.algorithms;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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

