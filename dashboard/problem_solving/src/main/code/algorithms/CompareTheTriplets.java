package main.code.algorithms;

import java.util.ArrayList;
import java.util.List;

class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int anaScore = 0;
        int bobScore = 0;

        if (a.get(0) < b.get(0))
            bobScore++;
        else if (a.get(0) > b.get(0))
            anaScore++;

        if (a.get(1) < b.get(1))
            bobScore++;
        else if (a.get(1) > b.get(1))
            anaScore++;

        if (a.get(2) < b.get(2))
            bobScore++;
        else if (a.get(2) > b.get(2))
            anaScore++;

        List<Integer> result = new ArrayList<>();
        result.add(anaScore);
        result.add(bobScore);

        return result;

    }
}
