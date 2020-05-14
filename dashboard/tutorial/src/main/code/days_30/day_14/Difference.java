package main.code.days_30.day_14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Difference {
    private final int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        List<Integer> elementsAsList = new ArrayList<>();

        for (int element : elements) {
            elementsAsList.add(element);
        }

        elementsAsList = elementsAsList.stream()
                .sorted()
                .collect(Collectors.toList());
        maximumDifference = Math.abs(
                elementsAsList.get(0) - elementsAsList.get(elementsAsList.size() - 1)
        );
    }
} // End of Difference class

