package main.code.days_30;

class day_11 {

    static int hourglassSum(int[][] arr) {

        int max = -900000000;
        int lineLength = arr.length;
        int colLength = arr[1].length;

        for (int i = 0; i < lineLength - 2; i++) {
            for (int j = 0; j < colLength - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1]  + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]  + arr[i + 2][j + 2];
                if (max < sum)
                    max = sum;
            }
        }
        return max;
    }
}
