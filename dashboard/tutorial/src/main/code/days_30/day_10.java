package main.code.days_30;

import java.util.Arrays;

class day_10 {

    static int maximumNumberOfContinuousOnes(int n){
        int[] binaryNum = new int[20];
        // Transform n to base 2 as a string
        int power;
        int powerOfTwoNum;
        while (n > 0) {
            power = 0;
            powerOfTwoNum = 1;
            // find max power of 2 smaller than current n
            while (powerOfTwoNum * 2 <= n) {
                powerOfTwoNum *= 2;
                power++;
            }

            // fill it in the array
            binaryNum[power] = 1;

            // deduct from the n the power of 2 we got
            n -= powerOfTwoNum;
        }

        int max = 0;
        int currentMax = 0;
        for (int value : binaryNum) {
            if (value == 1) {
                currentMax++;
            } else {
                if (max < currentMax) max = currentMax;
                currentMax = 0;
            }
        }

        return max;
    }
}
