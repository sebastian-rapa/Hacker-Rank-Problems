package main.code.warm_up_challanges;

class JumpingOnClouds {

    // This is how you call this method
    // System.out.println(JumpingOnClouds.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0}));
    // System.out.println(JumpingOnClouds.jumpingOnClouds(new int[] {0, 1, 0, 0, 0, 1, 0}));
    // System.out.println(JumpingOnClouds.jumpingOnClouds(new int[] {0, 0, 0, 1, 0, 0}));
    @SuppressWarnings("Duplicates")
    static int jumpingOnClouds (int[] c) {
        int numberOfSteps = 0;
        int i = 0;
        while (i < c.length) {
            if (i == c.length - 3 || i == c.length - 2) {
                numberOfSteps++;
                break;
            }

            if (c[i + 2] != 1) {
                numberOfSteps++;
                i += 2;
                continue;
            }
            numberOfSteps++;
            i++;
        }

        return numberOfSteps;
    }
}
