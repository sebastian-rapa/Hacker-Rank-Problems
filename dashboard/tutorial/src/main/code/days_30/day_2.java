package main.code.days_30;

class day_2 {

    static void printPriceIncludingTaxAndTip(double meal_cost, int tip_percent, int tax_percent) {
        int totalTaxes = tip_percent + tax_percent;
        long totalCost;
        totalCost = Math.round(meal_cost + meal_cost * totalTaxes / 100);
        System.out.println(totalCost);
    }
}
