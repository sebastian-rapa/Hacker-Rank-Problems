package main.code.algorithms;

import java.util.Arrays;

class BreakingRecords {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
    }

    static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int breakMin = 0;
        int breakMax = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                breakMax++;
            } else if (scores[i] < min) {
                min = scores[i];
                breakMin++;
            }
        }
        return new int[]{breakMax, breakMin};
    }
}
