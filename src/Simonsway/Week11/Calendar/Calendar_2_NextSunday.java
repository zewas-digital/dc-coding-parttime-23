package Simonsway.Week11.Calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_2_NextSunday {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysUntilNextSunday;

        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                daysUntilNextSunday = 7;
                break;
            case Calendar.MONDAY:
                daysUntilNextSunday = 6;
                break;
            case Calendar.TUESDAY:
                daysUntilNextSunday = 5;
                break;
            case Calendar.WEDNESDAY:
                daysUntilNextSunday = 4;
                break;
            case Calendar.THURSDAY:
                daysUntilNextSunday = 3;
                break;
            case Calendar.FRIDAY:
                daysUntilNextSunday = 2;
                break;
            case Calendar.SATURDAY:
                daysUntilNextSunday = 1;
                break;
            default:
                daysUntilNextSunday = 0;
        }

        calendar.add(Calendar.DAY_OF_YEAR, daysUntilNextSunday);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nächster Sonntag: " + dateFormat.format(calendar.getTime()));
    }

    }

