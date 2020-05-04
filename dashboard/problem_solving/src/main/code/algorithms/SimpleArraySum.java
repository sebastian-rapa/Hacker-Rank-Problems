package main.code.algorithms;

class SimpleArraySum {

    static int simpleArraySum(int[] array) {
        int sum = 0;

        for (int number : array)
            sum += number;

        return sum;
    }
}
