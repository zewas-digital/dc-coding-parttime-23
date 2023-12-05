package claudia.week11_calendar;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt.
Ändere dein Programm so ab, dass es Kalenderunabhängig den richtigen Wochenstart verwendet. Verwende dafür CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.DateTimeFormat.FirstDayOfWeek.
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

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Calendar_6_RegionalCalendar {

    public static void main(String[] args) {

        //public Locale.Builder setRegion(String region)
        //Locale aLocale = new Locale.Builder().setLanguage("th").setScript("Latn").setRegion("#Thai");

        //Locale locale  = new Locale("th", "TH");
        Calendar today = Calendar.getInstance();

        Calendar todayTH = Calendar.getInstance(new Locale("th_TH_#Thai"));
        todayTH.set(Calendar.YEAR, 2566);
       //System.out.println(Arrays.toString(today.getAvailableLocales()));//vgl Dok getInstance (Locale aLocale)
        //th_TH_#Thai
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("EEEEE, dd. LLLL yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEEE");
        System.out.println(dateFormat1.format(today.getTime()));
        System.out.println(dateFormat1.format(todayTH.getTime()));


    }
}
