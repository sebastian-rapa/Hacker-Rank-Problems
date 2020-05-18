package main.code.days_30.day_17;

public class Calculator {

    public int power(int n, int p){
        if (n < 0 || p < 0)
            throw new NegativeParameterException("n and p should be non-negative");

        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}
