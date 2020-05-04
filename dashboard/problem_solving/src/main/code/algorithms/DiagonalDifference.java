package main.code.algorithms;

import java.util.ArrayList;
import java.util.List;

class DiagonalDifference {

    static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            leftToRightDiagonal += arr.get(i).get(i);
            rightToLeftDiagonal += arr.get(i).get(n - i - 1);
        }

        return Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
    }
}
