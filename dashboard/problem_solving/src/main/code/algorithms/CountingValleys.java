package main.code.algorithms;

class CountingValleys {

    // This is how tou call this method
    //System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));
    //System.out.println(CountingValleys.countingValleys(8, "DUDUDDUU"));
    @SuppressWarnings("Duplicates")
    static int countingValleys(int n, String s) {
        char[] path = s.toCharArray();
        int numericalPath = 0;
        int numberOfValleys = 0;
        for (char c : path) {
            if (c == 'U' || c == 'u') {
                numericalPath++;
                if (numericalPath == 0)
                    numberOfValleys++;
                continue;
            }
            if (c == 'D' || c == 'd')
                numericalPath--;
            else
                throw new RuntimeException();

        }
        return numberOfValleys;
    }
}
