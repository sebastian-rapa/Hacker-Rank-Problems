package main.code.days_30.day_14;

public class Main {

    public static void main(String[] args) {
        Difference difference = new Difference(new int[]{1, 2, 5});
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}
