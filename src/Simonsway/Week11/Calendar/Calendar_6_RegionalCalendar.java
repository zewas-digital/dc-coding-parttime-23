package Simonsway.Week11.Calendar;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt. Ändere dein Programm so ab, dass es Kalenderunabhängig den richtigen Wochenstart verwendet. Verwende dafür CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.DateTimeFormat.FirstDayOfWeek. Teste dein Programm mit verschiedenen CultureInfo in der Start() Methode.

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

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Calendar_6_RegionalCalendar {

    public static void main(String[] args) {

        Locale thailand = new Locale("th_TH_#Thai");

        Calendar calendar = Calendar.getInstance(thailand);
        System.out.println(calendar.getFirstDayOfWeek());


        Locale germany = new Locale("de_DE");
        Locale austria = new Locale("de_AT");

        System.out.println("Thai");
        worldCalender(thailand, 2565, 4);
        System.out.println();

        System.out.println("Germany");
        worldCalender(germany, 2022, 4);

        System.out.println();
        System.out.println("Austria");
        worldCalender(austria, 2022, 4);

    }

    public static void worldCalender (Locale country, int year, int month){

        Calendar c = Calendar.getInstance(country);
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, 1);

        Calendar today = Calendar.getInstance(country);

        int weekday = c.get(Calendar.DAY_OF_WEEK);
        int startIndex = 0;
        int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(country);

        Locale thailand = new Locale("th_TH_#Thai");


       if (country.equals(thailand) && weekday == 0){
           System.out.println(" SU " + " MO " + " TH " + " WE " + " TH " + " FR " + " SA ");
           startIndex = 4;
        }
       else {
           System.out.println(" MO " + " DI " + " MI " + " DO " + " FR " + " SA " + " SO ");
           startIndex = weekday - 2;
       }

        System.out.println("---------------------------");

        int currentDay = 1;


        for (int i = 0; i < startIndex; i++) {
            System.out.print("    ");
        }

        for (int y = 0; currentDay <= lastDayOfMonth; y++) {
            for (int x = startIndex; x < 7; x++) {
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

