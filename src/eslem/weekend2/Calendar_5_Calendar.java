package eslem.weekend2;

/*

Aufgabe: Calendar

Erstelle ein Programm, welches einen Kalender korrekt darstellt. Verwende GregorianCalendar und DateTime dafür, der aktuelle Tag soll speziell markiert werden.

Achte darauf, dass

    Der aktuellen Tag ist mit Stern gekennzeichnet ist
    Nicht jeder Monat am Montag beginnt
    Nicht jeder Monat am Sonntag endet

Zum Testen sollst du verschiedene Tage als "heute" mit der Hilfe von DateTime(year, month, day) verwenden.

Die Ausgabe sollte wie folgt sein:

2022 April
| Mo | Di | Mi | Do | Fr | Sa | So |
|    |    |    |    |  1 |  2 |  3 |
|  4*|  5 |  6 |  7 |  8 |  9 | 10 |
| 11 | 12 | 13 | 14 | 15 | 16 | 17 |
| 18 | 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |    |

 */

import java.util.Calendar;
import java.util.Scanner;
public class Calendar_5_Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(Calendar.MONTH, 10);
        c.set(Calendar.DAY_OF_MONTH, 1);

        Calendar today = Calendar.getInstance();

        int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weekday = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(lastDayOfMonth);

        int start = 0;
        int current = 1;

        if (weekday == 1) {
            start = 6;
        } else {
            start = weekday - 2;
        }
        for (int i = 0; i < start; i++) {
            System.out.println("    ");
        }
        for (int y = 0; current <= lastDayOfMonth; y++) { // Schleife für jeden Tag des Monats
            //System.out.println("Äußere Schleife: currentDay: "+ currentDay);
            for (int x = start; x < 7; x++) { // Schleife für die Kalenderwochen
                //System.out.println("Innere Schleife: currentDay: "+ currentDay);
                if (current <= lastDayOfMonth) {
                    if (c.get(Calendar.YEAR) == today.get(Calendar.YEAR) &&
                            c.get(Calendar.MONTH) == today.get(Calendar.MONTH) &&
                            current == today.get(Calendar.DAY_OF_MONTH)
                    ) {
                        System.out.printf(" %02d*", current);
                    } else {
                        System.out.printf(" %02d ", current);
                    }
                    current++;
                } else {
                    break;
                }
            }
            start = 0;
            System.out.println();
        }
    }
}
