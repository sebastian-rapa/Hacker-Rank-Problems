package main.code.arrays;

class RotateLeft {

    // This is how you call this method
    // RotateLeft.rotateLeft(new int[]{1, 2, 3, 4, 5}, 4);
    // RotateLeft.rotateLeft(new int[]{1, 2, 3, 4, 5}, 6);

    static int[] rotateLeft(int[] array, int nrOfRotations) {
        int arrayLength = array.length;

        if (arrayLength == nrOfRotations)
            return array;

        if (arrayLength < nrOfRotations)
            nrOfRotations = nrOfRotations - arrayLength;

        for (int i = 0; i < nrOfRotations; i++) {
            int prevVal = array[0];
            int aux;
            for (int j = arrayLength - 1; j > 0; j--) {
                aux = array[j];
                array[j] = prevVal;
                prevVal = aux;
            }
            array[0] = prevVal;
        }
        return array;
    }
}
