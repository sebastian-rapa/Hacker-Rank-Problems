package main.code.days_30.day_19;

public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        if (n == 1)
            return 1;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        sum += n;
        return sum;
    }
}
