package claudia.week11_calendar;

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

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_5_Calendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar today = Calendar.getInstance(); //Kalenderobjekt mit aktuellem Datum "heute"
        //SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, dd. LLLL yyyy");
        SimpleDateFormat yearAndMonth = new SimpleDateFormat("yyyy LLLL");
        SimpleDateFormat weekday = new SimpleDateFormat("EE");

        System.out.println("\n" + yearAndMonth.format(calendar.getTime()));//gibt Jahr und Monat aus wie vorgegeben

        calendar.set(Calendar.DAY_OF_WEEK, 2); //2 = Montag, für die Überschriftszeile

        System.out.println("Anfang des Programms: Monat zum Zählen: " + calendar.get(Calendar.MONTH) + " Monat heute: " + today.get(Calendar.MONTH));

        //int year = Integer.parseInt(inputString[2]);
        //Drucke Überschriftszeile: ////////////////////////////////////////////////////////////////
        for (int i = 0; i < 7; i++) {
            //System.out.print("|" + weekday.format(calendar.getTime()) + " ");
            System.out.printf("| %.2s ", weekday.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println("|");
        //Überschrift fertig ////////////////////////////////////////////////////////////////

        calendar.set(Calendar.MONTH, today.get(Calendar.MONTH)); //Zählkalender wieder zurücksetzen
        calendar.set(Calendar.DAY_OF_MONTH, 1); //Datum auf ersten des Monats gesetzt

        while(calendar.get(Calendar.MONTH) == today.get(Calendar.MONTH)) {
            //Drucke eine Zeile:
            for (int i = 2; i < 9; i++) {
                if ((calendar.get(Calendar.DAY_OF_WEEK) == i || calendar.get(Calendar.DAY_OF_WEEK) == i % 7) && (calendar.get(Calendar.MONTH) == today.get(Calendar.MONTH) )) { //???TODO: i % 7??

                    System.out.printf("| %2s ", calendar.get(Calendar.DAY_OF_MONTH));
                    calendar.add(Calendar.DAY_OF_MONTH, 1);


                } else System.out.print("|    ");
            }
            System.out.println("|");//Zeile fertig -> Umbruch

        }

    }
}
