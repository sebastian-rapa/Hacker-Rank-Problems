package main.code.algorithms;

class MinMaxSum {

    static void miniMaxSum(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        long minimumSum = 0;
        long maximumSum = 0;
        boolean ignoredMin = false;
        boolean ignoredMax = false;
        for (int i : arr) {
            if (i != max || ignoredMin)
                minimumSum += i;
            else
                ignoredMin = true;
            if (i != min || ignoredMax)
                maximumSum += i;
            else
                ignoredMax = true;
        }

        System.out.println(minimumSum + " " + maximumSum);
    }
}
