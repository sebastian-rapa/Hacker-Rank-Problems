package main.code.days_30;

import java.util.Scanner;

class day_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        String[] testCases = new String[n];
        for (int i = 0; i < n; i++) {
            testCases[i] = scanner.next();
        }

        char[] currentCharArray;
        char currentChar;
        StringBuilder evenChars;
        StringBuilder oddChars;
        for (String testCase : testCases) {
            // instantiate new even/odd string builders
            evenChars = new StringBuilder();
            oddChars = new StringBuilder();
            // break the test case in char array
            currentCharArray = testCase.toCharArray();
            // build even chars & odd chars
            for (int i = 0; i < currentCharArray.length; i++) {
                currentChar = currentCharArray[i];
                if (i % 2 == 0)
                    evenChars.append(currentChar);
                else
                    oddChars.append(currentChar);
            }
            // print even chars & odd chars
            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }
    }
}
