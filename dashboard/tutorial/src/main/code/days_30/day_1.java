package main.code.days_30;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

class day_1 {

    static void printSumOfIntDoubleAndStringConcat(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);

            /* Declare second integer, double, and String variables. */
            int anotherInt = -1;
            double anotherDouble = -1.0;
            String anotherString;
            boolean introducedValidValue = false;

            scan.useDelimiter(Pattern.compile("(\\n)|;"));

            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

            // Reading input till i get a valid integer
            while (!introducedValidValue) {
                try {
                    System.out.println("Enter an integer number: ");
                    anotherInt = scan.nextInt();
                    introducedValidValue = true;
                } catch (InputMismatchException e) {
                    System.out.println("The input you provided it's not an integer number!");
                    scan.nextLine();
                }
            }

            // Reading input till i get a valid Double
            introducedValidValue = false;
            while (!introducedValidValue) {
                try {
                    System.out.println("Enter an double number: ");
                    anotherDouble = scan.nextDouble();
                    introducedValidValue = true;
                } catch (InputMismatchException e) {
                    System.out.println("The input you provided it's not an double number!");
                    scan.nextLine();
                }
            }

            // Reading whatever char sequence the user inputs as a string;
            System.out.println("Enter string of characters: ");
            anotherString = scan.next();

            /* Print the sum of both integer variables on a new line. */
            System.out.println(i + anotherInt);

            /* Print the sum of the double variables on a new line. */
            System.out.println(d + anotherDouble);

            /* Concatenate and print the String variables on a new line;
                the 's' variable above should be printed first. */
            System.out.println(s + anotherString);

            scan.close();
        }
}

