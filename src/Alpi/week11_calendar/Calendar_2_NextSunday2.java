package Alpi.week11_calendar;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_2_NextSunday2 {

    public static void main(String[] args) {
        //GregorianCalendar erstellen

        Calendar calendar = new GregorianCalendar();


        //Tag des nächsten Sonntags ermitteln

        int dayoffweek = calendar.get(Calendar.DAY_OF_WEEK);

        // Solange der aktuelle Tag nicht Sonntag ist , den Tag um einen erhöhen

        while (dayoffweek != Calendar.SUNDAY){

            calendar.add(Calendar.DAY_OF_WEEK, 1);
            dayoffweek = calendar.get(Calendar.DAY_OF_WEEK);

        }
        // Datum des nächsten Sonntags ausgeben
        System.out.println(calendar.getTime());



    }
}
