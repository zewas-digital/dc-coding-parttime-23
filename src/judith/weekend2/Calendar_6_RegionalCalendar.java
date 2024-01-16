package judith.weekend2;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt.
Ändere dein Programm so ab, dass es Kalenderunabhängig den richtigen Wochenstart verwendet.
Verwende dafür CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.
DateTimeFormat.FirstDayOfWeek.
Teste dein Programm mit verschiedenen (CultureInfo) gibt es nicht in Java getInstance(Locale...) ist eig. auch
schon veraltet NEU wäre ISO3 country,......
in der Start() Methode.

Aufruf

CultureInfo austrian = new CultureInfo("de-AT");
DayOfWeek dow = austrian.DateTimeFormat.FirstDayOfWeek;

//Locale wird auf Thailand gesetzt, hier wird der Buddistische Kalender verwendet
PrintCalendar("th-TH", 2565, 4); // Jahr und Monat

//Locale wird auf Deutschland gesetzt, hier wird der Gregorianische Kalender verwendet
PrintCalendar("de-DE", 2022, 4); // Jahr und Monat

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

import java.util.Calendar;

public class Calendar_6_RegionalCalendar {

    public static void main(String[] args) {

        //Kalender erstellen
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,3);
        c.set(Calendar.YEAR,2022);
        Calendar today = Calendar.getInstance();

        int weekday = c.get(Calendar.DAY_OF_WEEK);
        int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Letzter Tag des Monats " + lastDayOfMonth);


    }
}
