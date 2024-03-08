package eslem.weekendCalendar;

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
        Scanner s = new Scanner(System.in);

        c.set(Calendar.MONTH, 10);
        c.set(Calendar.DAY_OF_MONTH, 1);

        Calendar today = Calendar.getInstance();


        int weekday = c.get(Calendar.DAY_OF_WEEK);
        int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(lastDayOfMonth);

        int currentDay = 1;


        int startIndex = 0;

        if (weekday == 1) { // Sonntag
            startIndex = 6;
        } else {
            startIndex = weekday - 2;
        }


        for (int i = 0; i < startIndex; i++) {
            System.out.print("    ");
        }

        for (int y = 0; currentDay <= lastDayOfMonth; y++) { // Schleife für jeden Tag des Monats
            //Äußere Schleife
            for (int x = startIndex; x < 7; x++) { // Schleife für Kalenderwochen
                //Innere Schleife
                if (currentDay <= lastDayOfMonth) {
                    if (c.get(Calendar.YEAR) == today.get(Calendar.YEAR) &&
                            c.get(Calendar.MONTH) == today.get(Calendar.MONTH) &&
                            currentDay == today.get(Calendar.DAY_OF_MONTH)
                    ) {
                        System.out.printf(" %02d*", currentDay);
                    } else {
                        System.out.printf(" %02d ", currentDay);
                    }
                    currentDay++;
                } else {
                    break;
                }
            }
            startIndex = 0;

            System.out.println();
        }

    }
}

