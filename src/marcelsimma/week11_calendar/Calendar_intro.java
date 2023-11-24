package marcelsimma.week11_calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendar_intro {

    public static void main(String[] args) {

        /*

        24.11.2023
        11.24.
        11-24

         */

        Date today = new Date();

        System.out.println(today);
        System.out.println(today.getTime());
        long seconds = today.getTime() / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long months = days / 30;
        long years = months / 12;

        System.out.println(years);

        Calendar c = Calendar.getInstance();

        System.out.println(c);

        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());


        System.out.println(c.get(Calendar.MONTH));











        /*

        // Date Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        // Calendar Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MILLISECOND));
        c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());
        System.out.println((c.get(Calendar.DAY_OF_WEEK)));
*/

    }
}



/*
// Get an instance of a Calendar, using the current time.
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            System.out.println(dateFormat.format(calendar.getTime()));

            // Printing some information...
            System.out.println("ERA: " + calendar.get(Calendar.ERA));
            System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
            System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
            System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("DATE: " + calendar.get(Calendar.DATE));
            System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
            System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
            System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
            System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
            System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
            System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
            System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
 */