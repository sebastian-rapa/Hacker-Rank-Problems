package main.code.algorithms;

import java.util.List;

class BetweenTwoSets {

    static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int beginningNumber = a.stream().
                max((number1, number2) -> number1 > number2 ? number1 : number2).orElse(0);
        int endingNumber = b.stream().
                min((number1, number2) -> number1 < number2 ? number1 : number2).orElse(0);
        int numberToReturn = 0;
        boolean continueChecking;
        for (int i = beginningNumber; i <= endingNumber; i++) {
            continueChecking = true;
            for (int integer : a) {
                if (i % integer != 0) {
                    continueChecking = false;
                    break;
                }
            }
            for (int integer : b) {
                if (integer % i != 0) {
                    continueChecking = false;
                    break;
                }
            }
            if (continueChecking)
                numberToReturn++;
        }

        return numberToReturn;
    }
}
