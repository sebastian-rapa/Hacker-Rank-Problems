package main.code.algorithms;

class AVeryBigSum {

    static long aVeryBigSum(long[] arr){
        long sum = 0;
        for (long l : arr) {
            sum += l;
        }
        return sum;
    }
}
