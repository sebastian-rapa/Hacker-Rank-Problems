package main.code.arrays;

class ArrayManipulation {

    // TODO: Have another look, didn t pass the time test
    static long arrayManipulation(int n, int[][] queries){
        long[] numberOfIntegers = new long[n];
        int startingIndex;
        int endingIndex;
        long numberToAdd;
        long max = -1;

        for (int i = 0; i < queries.length; i++) {
            startingIndex = queries[i][0];
            endingIndex = queries[i][1];
            numberToAdd = queries[i][2];

            for (int j = startingIndex - 1; j <= endingIndex - 1; j++) {
                numberOfIntegers[j] += numberToAdd;
                if (numberOfIntegers[i] > max)
                    max = numberOfIntegers[j];
            }
        }

        return max;
    }
}
