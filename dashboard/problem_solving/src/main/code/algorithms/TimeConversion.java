package main.code.algorithms;

class TimeConversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        boolean isAM = s.toLowerCase().endsWith("am");
        boolean isPM = s.toLowerCase().endsWith("pm");

        if (isAM)
            s = s.toLowerCase().replace("am", "");
        else if (isPM)
            s = s.toLowerCase().replace("pm", "");

        String[] hourMinuteSecond = s.split(":");

        int hour = Integer.parseInt(hourMinuteSecond[0]);
        int minute = Integer.parseInt(hourMinuteSecond[1]);
        int second = Integer.parseInt(hourMinuteSecond[2]);

        StringBuilder twentyFourHourFormat = new StringBuilder();

        if (isAM) {
            if (hour == 12)
                twentyFourHourFormat.append("00:");
            else
                twentyFourHourFormat.append(hourMinuteSecond[0]).append(":");
            twentyFourHourFormat.append(hourMinuteSecond[1]).append(":");
            twentyFourHourFormat.append(hourMinuteSecond[2]);
        } else if (isPM) {
            if (hour < 12)
                hour += 12;
            twentyFourHourFormat.append(hour).append(":");
            twentyFourHourFormat.append(hourMinuteSecond[1]).append(":");
            twentyFourHourFormat.append(hourMinuteSecond[2]);
        }
        return twentyFourHourFormat.toString();
    }
}
