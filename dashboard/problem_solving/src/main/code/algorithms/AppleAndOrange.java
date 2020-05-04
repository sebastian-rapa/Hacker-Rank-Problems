package main.code.algorithms;

class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int nrOfApplesFallenInHouse = 0;
        int nrOfOrangesFallenInHouse = 0;
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
            if (apples[i] >= s && apples[i] <= t) {
                nrOfApplesFallenInHouse++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
            if (oranges[i] >= s && oranges[i] <= t) {
                nrOfOrangesFallenInHouse++;
            }
        }

        System.out.println(nrOfApplesFallenInHouse);
        System.out.println(nrOfOrangesFallenInHouse);

    }

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }
}
