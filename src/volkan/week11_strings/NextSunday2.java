package volkan.week11_strings;

import java.util.Calendar;

public class NextSunday2 {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();

        int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekOffset = 8 - dayOfWeek;

        calender.add(Calendar.DATE, dayOfWeekOffset);

        int day = calender.get(Calendar.DAY_OF_MONTH);
        int month = calender.get(Calendar.MONTH) + 1;
        int year = calender.get(Calendar.YEAR);

        System.out.println("Nächster Sonntag ist: " + day + "." + month + "." + year);

    }
}
