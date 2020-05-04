package main.code.arrays;

class Main {


    public static void main(String[] args) {
        MinimumBribe.minimumBribes(new int[]{2, 1, 5, 3, 4});
        MinimumBribe.minimumBribes(new int[]{2, 5, 1, 3, 4});
        MinimumBribe.minimumBribes(new int[]{5, 1, 2, 3, 7, 8, 6, 4});
        MinimumBribe.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }

    // Helping method for the Array2D problem
    private static int[][] get2DArray() {
        int[][] array = new int[3][6];
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 10;
        array[0][4] = 1;
        array[0][5] = 1;
        array[1][0] = 2;
        array[1][1] = 2;
        array[1][2] = 2;
        array[1][3] = 20;
        array[1][4] = 2;
        array[1][5] = 2;
        array[2][0] = 3;
        array[2][1] = 3;
        array[2][2] = 3;
        array[2][3] = 30;
        array[2][4] = 2;
        array[2][5] = 2;


        return array;
    }

}
