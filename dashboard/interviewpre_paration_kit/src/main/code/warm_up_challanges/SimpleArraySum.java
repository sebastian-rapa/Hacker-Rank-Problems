package main.code.warm_up_challanges;

class SimpleArraySum {

    static int simpleArraySum(int[] array) {
        int sum = 0;

        for (int number : array)
            sum += number;

        return sum;
    }
}
