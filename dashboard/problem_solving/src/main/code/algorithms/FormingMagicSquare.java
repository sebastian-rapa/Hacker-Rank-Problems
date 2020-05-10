package main.code.algorithms;

import java.util.Arrays;

class FormingMagicSquare {

    // TODO: Finish this
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int[] lineSums = new int[3];
        int[] colSums = new int[3];
        int diagPrincipala = 0;
        int diagSecundara = 0;
        int lineSum;
        int colSum;
        for (int i = 0; i < s.length; i++) {
            lineSum = 0;
            colSum = 0;
            for (int j = 0; j < s[0].length; j++) {
                lineSum += s[i][j];
                colSum += s[j][i];
                if (i == j) diagPrincipala += s[i][j];
                if (i + j + 1 == s.length) diagSecundara += s[i][j];
            }
            lineSums[i] = lineSum;
            colSums[i] = colSum;
        }
        System.out.println(Arrays.toString(lineSums));
        System.out.println(Arrays.toString(colSums));
        System.out.println(diagPrincipala);
        System.out.println(diagSecundara);
        return 0;
    }

    public static void main(String[] args) {
        formingMagicSquare(get2DArray());
    }

    private static int[][] get2DArray() {
        int[][] array = new int[3][3];
        array[0][0] = 4;
        array[0][1] = 9;
        array[0][2] = 2;
        array[1][0] = 3;
        array[1][1] = 5;
        array[1][2] = 7;
        array[2][0] = 8;
        array[2][1] = 1;
        array[2][2] = 5;
        return array;
    }
}
