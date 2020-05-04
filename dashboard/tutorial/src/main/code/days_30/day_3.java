package main.code.days_30;

class day_3 {

    static void printWeirdOrNotWeird(int n) {
        if(n % 2 == 0) {
            if (n >= 2 && n < 6)
                System.out.println("Not Weird");
            else if (n >= 6 && n <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
