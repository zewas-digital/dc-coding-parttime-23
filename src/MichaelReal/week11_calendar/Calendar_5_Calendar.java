package MichaelReal.week11_calendar;

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
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_5_Calendar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bitte geben Sie das Jahr ein: ");
            int year = scanner.nextInt();

            System.out.print("Bitte geben Sie den Monat ein (1-12): ");
            int month = scanner.nextInt();

            int today = getCurrentDay();

            printCalendar(year, month, today);
        }

        static void printCalendar(int year, int month, int today) {
            Calendar calendar = new GregorianCalendar(year, month - 1, 1);
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int offset = (calendar.get(Calendar.DAY_OF_WEEK) - Calendar.MONDAY + 7) % 7;

            System.out.println(year + " " + getMonthName(month) + " 🤓");
            System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

            for (int i = 0; i < offset; i++) {
                System.out.print("|    ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                if (day == today && isCurrentMonth(year, month)) {
                    System.out.printf("|%3d💕", day);
                } else {
                    System.out.printf("|%4d", day);
                }

                if ((offset + day) % 7 == 0 || day == daysInMonth) {
                    System.out.println("|");
                }
            }
        }

    static boolean isCurrentMonth(int year, int month) {
        Calendar currentCalendar = Calendar.getInstance();
        int currentYear = currentCalendar.get(Calendar.YEAR);
        int currentMonth = currentCalendar.get(Calendar.MONTH) + 1; // Monate sind 0-basiert

        return (year == currentYear && month == currentMonth);
    }

        static int getCurrentDay() {
            Calendar today = Calendar.getInstance();
            return today.get(Calendar.DAY_OF_MONTH);
        }

        static String getMonthName(int month) {
            String[] monthNames = {
                    "", "January", "February", "March", "April", "May", "June", "July",
                    "August", "September", "October", "November", "December"
            };
            return monthNames[month];
        }
    }

