package main.code.algorithms;

import java.util.ArrayList;
import java.util.List;

class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        bill.remove(bill.get(k));
        int sum = 0;
        for (Integer integer : bill) {
            sum += integer;
        }

        sum /= 2;

        if (sum == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - sum);
    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(
                bill,
                1,
                12
        );
        bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(
                bill,
                1,
                7
        );
    }
}
