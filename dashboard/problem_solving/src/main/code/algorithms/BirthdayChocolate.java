package main.code.algorithms;

import java.util.List;

class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int currentSum;
        for (int i = 0; i < s.size() - m; i++) {
            currentSum = s.get(i);
            for (int j = i + 1; j < i + m; j++) {
                currentSum += s.get(j);
            }
        }
    }
}
