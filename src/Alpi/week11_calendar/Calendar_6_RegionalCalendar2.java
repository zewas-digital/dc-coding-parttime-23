package Alpi.week11_calendar;
/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig,
weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist,
da ihre Woche am Sonntag beginnt. Ändere dein Programm so ab,
dass es Kalenderunabhängig den richtigen Wochenstart verwendet.

Verwende dafür CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.DateTimeFormat.FirstDayOfWeek.
Teste dein Programm mit verschiedenen CultureInfo in der Start() Methode.

Aufruf

CultureInfo austrian = new CultureInfo("de-AT");
DayOfWeek dow = austrian.DateTimeFormat.FirstDayOfWeek;

//Locale wird auf Thailand gesetzt,
hier wird der Buddistische Kalender verwendet
PrintCalendar("th-TH", 2565, 4);

//Locale wird auf Deutschland gesetzt, hier wird der Gregorianische Kalender verwendet
PrintCalendar("de-DE", 2022, 4);

Ausgabe

2022 04
| Mo | Di | Mi | Do | Fr | Sa | So |
|    |    |    |    |  1 |  2 |  3 |
|  4*|  5 |  6 |  7 |  8 |  9 | 10 |
| 11 | 12 | 13 | 14 | 15 | 16 | 17 |
| 18 | 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |    |

2565 04
| So | Mo | Di | Mi | Do | Fr | Sa |
|    |    |    |    |    |  1 |  2 |
|  3 |  4*|  5 |  6 |  7 |  8 |  9 |
| 10 | 11 | 12 | 13 | 14 | 15 | 16 |
| 17 | 18 | 19 | 20 | 21 | 22 | 23 |
| 24 | 25 | 26 | 27 | 28 | 29 | 30 |


 */

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Calendar_6_RegionalCalendar2 {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();
        System.out.println(Arrays.toString(today.getAvailableLocales()));

        System.out.println(
                "today...   day: " + today.get(Calendar.DAY_OF_MONTH) +
                        " month: " + today.get(Calendar.MONTH) +
                        " year: " + today.get(Calendar.YEAR) +
                        " dayOfWeek: " + today.get(Calendar.DAY_OF_WEEK) +
                        " firstDayOfWeek: " + today.getFirstDayOfWeek());

        Calendar todayTH = Calendar.getInstance(new Locale("th_TH_#Thai"));
        todayTH.set(Calendar.YEAR, 2566);

        System.out.println(
                "todayTH... day: " + todayTH.get(Calendar.DAY_OF_MONTH) +
                        " month: " + todayTH.get(Calendar.MONTH) +
                        " year: " + todayTH.get(Calendar.YEAR) +
                        " dayOfWeek: " + todayTH.get(Calendar.DAY_OF_WEEK) +
                        " firstDayOfWeek: " + todayTH.getFirstDayOfWeek());
    }
}
