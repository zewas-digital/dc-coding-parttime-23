package marcelsimma.week11_calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.util.Calendar;

public class Calendar_3_NumOfSundays {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); // 25.11.2023

        c.set(Calendar.YEAR, 2024); // 25.11.2024

        c.set(Calendar.MONTH, 0); // 25.01.2024

        c.set(Calendar.DAY_OF_MONTH, 1); // 1.01.2024

        System.out.println(c.getTime());

        int numberOfDaysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        int numberOfSundays = 0;

        for (int i = 0; i <= numberOfDaysInMonth; i++) {
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                numberOfSundays++;
            }

            c.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(numberOfSundays);


    }
}


/*
    public static void main(String[] args) {
        // Beispielaufruf der Methode mit dem Jahr 2023 und dem Monat November (10 für Oktober)
        int anzahlSonntage = getAnzahlSonntageImMonat(2023, Calendar.NOVEMBER);
        System.out.println("Anzahl der Sonntage im Monat: " + anzahlSonntage);
    }

    public static int getAnzahlSonntageImMonat(int jahr, int monat) {
        // Erstellen eines Calendar-Objekts und Setzen des Datums auf den ersten Tag des Monats
        Calendar calendar = Calendar.getInstance();
        calendar.set(jahr, monat, 1);

        // Festlegen des letzten Tages des Monats
        int letzterTagDesMonats = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Zählen der Sonntage im Monat
        int anzahlSonntage = 0;
        while (calendar.get(Calendar.DAY_OF_MONTH) <= letzterTagDesMonats) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                anzahlSonntage++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        return anzahlSonntage;
    }
 */