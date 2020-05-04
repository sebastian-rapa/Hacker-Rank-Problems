package main.code.arrays;

class MinimumSwaps2 {
    static int minimumSwaps2(int[] arr){
        int indexOfCurrentPosition = 0;
        int numberOfSwaps = 0;
        int aux;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        indexOfCurrentPosition = j;
                        break;
                    }
                }
                aux = arr[i];
                arr[i] = arr[indexOfCurrentPosition];
                arr[indexOfCurrentPosition] = aux;
                numberOfSwaps++;
            }
        }
        return numberOfSwaps;
    }
}
