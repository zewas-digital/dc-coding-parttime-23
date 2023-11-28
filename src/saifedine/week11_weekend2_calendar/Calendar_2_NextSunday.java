package saifedine.week11_weekend2_calendar;

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

        // Calender initialisieren
        Calendar c = Calendar.getInstance();

        // 1. index vom Wochentag? --> 7
        System.out.println("Der Index vom aktuellen Wochentag ist: " + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("-------------------------------------");

        // 2. Differenz aus Wochentag & Sonntag --> 1
        System.out.println("Die Differenz zum Sonntag ist: " + ((1 + 7) - Calendar.DAY_OF_WEEK));
        int diff = (1 + 7) - Calendar.DAY_OF_WEEK;

        System.out.println("-------------------------------------");

        // Option 1:
        // 3. heutiges Datum + Differenz = neues Datum
        // setze (heutiges Datum + Differenz)
        c.set(c.get(Calendar.YEAR),(c.get(Calendar.MONTH) + 1),(c.get(Calendar.DATE) + diff));
        // neues Datum ausgeben
        System.out.println("Das gewünschte Datum ist: " + c.get(Calendar.YEAR) + " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DATE));

        System.out.println("-------------------------------------");

        // Option 2:
        // 3. heutiges Datum + Differenz = neues Datum
        // addiere (heutiges Datum + Differenz)
        c.add(Calendar.DATE, diff);
        // neues Datum ausgeben
        System.out.println("Das gewünschte Datum ist: " + c.get(Calendar.YEAR) + " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DATE));
        //System.out.println(c.getTime());
    }
}
