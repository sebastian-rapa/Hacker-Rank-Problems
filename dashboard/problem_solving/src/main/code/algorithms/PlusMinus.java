package main.code.algorithms;

class PlusMinus {

    static void plusMinus(int[] arr) {
        int numberOfPositiveNumbers = 0;
        int numberOfNegativeNumbers = 0;
        int numberOfZeros = 0;

        for (int i : arr) {
            if (i < 0)
                numberOfNegativeNumbers++;
            else if (i > 0)
                numberOfPositiveNumbers++;
            else
                numberOfZeros++;
        }

        // Printing the positive numbers ration
        int arrayLength = arr.length;
        System.out.println((double)numberOfPositiveNumbers / (double) arrayLength);
        System.out.println((double)numberOfNegativeNumbers / (double) arrayLength);
        System.out.println((double)numberOfZeros / (double) arrayLength);
    }
}
