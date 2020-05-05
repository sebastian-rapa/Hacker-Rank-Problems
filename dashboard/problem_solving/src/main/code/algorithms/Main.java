package main.code.algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // Reading an int array from the console, first line has n and second the array
        /*int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        firstList.add(2);
        firstList.add(4);
        secondList.add(16);
        secondList.add(32);
        secondList.add(96);
        System.out.println(BetweenTwoSets.getTotalX(firstList, secondList));
//        scanner.close();
    }

    private static List<List<Integer>> getArrayForDiagonalDifferenceProblem(){

        List<List<Integer>> array = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(11);
        line.add(2);
        line.add(4);
        array.add(line);
        line = new ArrayList<>();
        line.add(4);
        line.add(5);
        line.add(6);
        array.add(line);
        line = new ArrayList<>();
        line.add(10);
        line.add(8);
        line.add(-12);
        array.add(line);
        return array;
    }
}
