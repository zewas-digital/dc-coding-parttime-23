package saifedine.week11_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

// addiere Tage
// gib

// siehe Flipchart-Foto
// Datum 29.11.2023
// 1. index vom Wochentag? 1 - 7 --> 4 (Info: Day of Week (Index vom Wochentag holen) - wochentag in index (1-7) - Sonntag ist 1)
// 2. Differenz aus Wochentag & Sonntag (1+7) - 4 = 3
// 3. 29.11.2023 + 3 = 03.12.2023

// Hilfsmittel:
// Calender.day
// getDay(); 29
// setDay(30);
// Calender.day = 30

import java.util.Calendar;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_WEEK));



    }
}
