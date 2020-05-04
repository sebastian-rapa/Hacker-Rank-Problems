package main.code.algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Staircase {

    static void staircase(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        String spaces;
        String hashtags;

        for (int i = 1; i <= n; i++) {
            spaces = IntStream
                    .range(0, n - i)
                    .mapToObj(integer -> " ")
                    .collect(Collectors.joining());

            hashtags = IntStream
                    .range(0, i)
                    .mapToObj(integer -> "#")
                    .collect(Collectors.joining());

            stringBuilder.append(spaces).append(hashtags).append("\n");
        }

        System.out.println(stringBuilder.toString());
    }
}
