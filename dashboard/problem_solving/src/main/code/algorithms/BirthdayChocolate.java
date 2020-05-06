package main.code.algorithms;

import java.util.List;

class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int currentSum;
        int nrOfCombinations = 0;
        if (s.size() == 1)
            if (s.get(0) == d)
                return 1;
            else
                return 0;

        System.out.println("list size: " + s.size());
        for (int i = 0; i <= s.size() - m; i++) {
            currentSum = s.get(i);
            for (int j = i + 1; j < i + m; j++) {
                currentSum += s.get(j);
            }
            if (currentSum == d)
                nrOfCombinations++;
        }
        return nrOfCombinations;
    }
}
