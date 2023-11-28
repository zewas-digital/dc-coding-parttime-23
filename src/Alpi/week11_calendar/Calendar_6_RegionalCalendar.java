package Alpi.week11_calendar;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden
Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt. Ändere dein Programm so ab,
dass es Kalenderunabhängig den richtigen Wochenstart verwendet. Verwende dafür
CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.DateTimeFormat.FirstDayOfWeek.
Teste dein Programm mit verschiedenen CultureInfo in der Start() Methode.

Aufruf

CultureInfo austrian = new CultureInfo("de-AT");
DayOfWeek dow = austrian.DateTimeFormat.FirstDayOfWeek;

//Locale wird auf Thailand gesetzt, hier wird der Buddistische Kalender verwendet
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

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar_6_RegionalCalendar {

    public static void main(String[] args) {
        // Locale für Österreich
        Locale austrian = new Locale("de-AT");

        // Locale wird auf Thailand gesetzt, hier wird der Buddistische Kalender verwendet
        PrintCalendar(austrian, 2565, 4);

        // Locale wird auf Deutschland gesetzt, hier wird der Gregorianische Kalender verwendet
        PrintCalendar(new Locale("de-DE"), 2022, 4);
    }

    public static void PrintCalendar(Locale locale, int year, int month) {
        // Locale für den Kalender festlegen
        LocalDate date = LocalDate.of(year, month, 1);

        // Wochentag des Startdatums ermitteln
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Spaltenbreite für die Wochentage festlegen
        int columnWidth = 3;

        // Kalender ausgeben
        System.out.println(year + " " + month);
        System.out.print("| ");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%" + columnWidth + "s | ", day.getDisplayName(TextStyle.SHORT, locale));
        }
        System.out.println();

        // Kalenderzeilen ausgeben
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            // Datum in der aktuellen Zeile ermitteln
            LocalDate currentDate = date.plusDays(i);

            // Wochentag des aktuellen Datums ermitteln
            DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();

            // Zeile ausgeben
            System.out.printf("%" + columnWidth + "s | ", currentDate.format(DateTimeFormatter.ofPattern("dd", locale)) + " " + currentDayOfWeek.getDisplayName(TextStyle.SHORT, locale));
        }
        System.out.println();
    }
}
