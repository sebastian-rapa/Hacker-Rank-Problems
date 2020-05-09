package main.code.algorithms;

class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int max = -1;
        int currentSum;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                currentSum = keyboard + drive;
                if (max < currentSum && currentSum <= b)
                    max = currentSum;
            }
        }
        return max;
    }
}
