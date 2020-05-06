package main.code.days_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class day_8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            String output;
            output =
                null == phoneBook.get(s) ?
                        "Not found" :
                        s + "=" + phoneBook.get(s);
            System.out.println(output);
        }
        in.close();
    }
}
