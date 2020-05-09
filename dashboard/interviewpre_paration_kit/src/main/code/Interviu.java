package main.code;

import java.util.Currency;

public class Interviu {
    public static int StringReduction(String str) {

        int strLength;
        while (str.length() > 1){
            char[] chars = str.toCharArray();
            char currentChar;
            char prevChar = chars[0];
            strLength = str.length();
            StringBuilder finalBuilder = new StringBuilder();
            StringBuilder auxBuilder;
            for (int i = 1; i < chars.length; i++) {
                auxBuilder = new StringBuilder();
                currentChar = chars[i];
                if (prevChar != currentChar) {

                    if (prevChar < currentChar)
                        auxBuilder.append(prevChar).append(currentChar);
                    else
                        auxBuilder.append(currentChar).append(prevChar);

                    switch (auxBuilder.toString()) {
                        case "ab":
                                finalBuilder.append(str, 0,  - 1).append('c');
                            if (i + 1 < strLength)
                                finalBuilder.append(str, i + 1, strLength);
                            break;
                        case "ac":
                            finalBuilder.append(str, 0, i - 1).append('b').append(str.substring(i + 1));
                            if (i + 1 < strLength)
                                finalBuilder.append(str, i + 1, strLength);
                            break;
                        case "bc":
                            finalBuilder.append(str, 0,  - 1).append('a').append(str.substring(i + 1));
                            if (i + 1 < strLength)
                                finalBuilder.append(str, i + 1, strLength);
                            break;
                    }

                    str = finalBuilder.toString();
                    break;
                }
                else {
                    prevChar = chars[i];
                }
            }
            /*for (int i = 0; i < strLength - 2; i++) {
                switch (str.substring(i, i + 2)) {
                    case "aa":
                    case "bb":
                    case "cc":
                        continue;
                    case "ab":
                    case "ba":
                        finalBuilder.append(str, 0, i).append('c');
                        if (i + 2 < strLength)
                                finalBuilder.append(str.substring(i + 1, strLength));
                        break;
                    case "ac":
                    case "ca":
                        finalBuilder.append(str, 0, i).append('b');
                        if (i + 2 < strLength)
                                finalBuilder.append(str, i + 1, strLength);
                        break;
                    case "bc":
                    case "cb":
                        finalBuilder.append(str, 0, i).append('a');
                        if (i + 2 < strLength)
                                finalBuilder.append(str.substring(i + 1, strLength));
                        break;
                }

            }*/
            str = finalBuilder.toString();
            if (strLength == str.length()) {
                break;
            }

        }
        /*StringBuilder finalBuilder = new StringBuilder();
        for (int i = 0; i < stringSpliced.length; i++) {
            if (stringBuilder.length() < 2)
                stringBuilder.append(stringSpliced[i]);
            else if (stringBuilder.toString().matches("a{2} | b{2} | c{2}"))
                stringBuilder.insert(1, stringSpliced[i]);
            else {

            }

        }*/
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(StringReduction("abcabc"));
    }
}
