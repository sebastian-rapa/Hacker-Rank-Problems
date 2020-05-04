package main.code.warm_up_challanges;

class RepeatingString {

    // This is how you call this method
    /*
    System.out.println(RepeatingString.repeatingString("aba", 10));
    System.out.println(RepeatingString.repeatingString("a", 1000000));
    System.out.println(RepeatingString.repeatingString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
    System.out.println(RepeatingString.repeatingStringV2("aba", 10));
    System.out.println(RepeatingString.repeatingStringV2("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
    System.out.println(RepeatingString.repeatingStringV2("a", 1000000));
    */

    @SuppressWarnings("Duplicates")
    static long repeatingString(String s, long n) {
        StringBuilder stringBuilder = new StringBuilder();

        if (s.equals("a"))
            return n;

        while (stringBuilder.length() < n)
            stringBuilder.append(s);

        int numberOfA = 0;
        char[] chars = stringBuilder.toString().toCharArray();

        for (int i = 0; i < n; i++) {
            if (chars[i] == 'a')
                numberOfA++;
        }

        return numberOfA;
    }

    static long repeatingStringV2(String s, long n) {
        if (s.equals("a"))
            return n;

        long numberOfAInS = 0;

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == 'a')
                numberOfAInS++;
        }

        numberOfAInS *= (long) (n / s.length());

        long remainder = n % s.length();
        if (remainder != 0) {
            for (int i = 0; i < remainder; i++) {
                if (chars[i] == 'a')
                    numberOfAInS++;
            }
        }
        return numberOfAInS;
    }
}
