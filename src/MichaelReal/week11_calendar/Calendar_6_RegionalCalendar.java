package MichaelReal.week11_calendar;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt.
Ändere dein Programm so ab, dass es Kalenderunabhängig den richtigen Wochenstart verwendet. Verwende dafür CultureInfo.DateTimeFormat.Calendar und CultureInfo.DateTimeFormat.FirstDayOfWeek.
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

https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calendar_6_RegionalCalendar {
        public static void main(String[] args) {
            // Eingabe von Monat und Jahr für den lokalen Kalender
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie den Monat (MM) ein: ");
            int monthLocal = scanner.nextInt();
            System.out.print("Geben Sie das Jahr (YYYY) ein: ");
            int yearLocal = scanner.nextInt();

            // Lokaler Kalender ausgeben
            printCalendar(monthLocal, yearLocal, "Local 🤓");

            // Kalender für Thailand ausgeben (2565 ist das Jahr 2022 + 543 Jahre)
            printCalendar(monthLocal, yearLocal + 543, "Thailand 🦄");
        }

        private static void printCalendar(int month, int year, String location) {
            LocalDate date = LocalDate.of(year, month, 1);
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM");
            System.out.println(formatter.format(date) + " - " + location);

            // Kopfzeile des Kalenders
            System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

            // Leere Zellen für den ersten Tag des Monats
            for (int i = 1; i < date.getDayOfWeek().getValue(); i++) {
                System.out.print("|    ");
            }

            // Tage des Monats ausgeben
            while (date.getMonthValue() == month) {
                // Markiere den aktuellen Tag mit einem '💕'
                if (date.equals(today)) {
                    if (date.getDayOfMonth() < 10) {
                        System.out.print("|  " + date.getDayOfMonth() + "💕");
                    } else {
                        System.out.print("| " + date.getDayOfMonth() + "💕");
                    }
                } else {
                    if (date.getDayOfMonth() < 10) {
                        System.out.print("|  " + date.getDayOfMonth() + " ");
                    } else {
                        System.out.print("| " + date.getDayOfMonth() + " ");
                    }
                }

                // Wenn der Tag ein Sonntag ist, beginne eine neue Zeile
                if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println("|");
                }

                // Zum nächsten Tag gehen
                date = date.plusDays(1);
            }

            // Restliche leere Zellen am Ende des Monats
            while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
                System.out.print("|    ");
                date = date.plusDays(1);
            }

            // Neue Zeile für den nächsten Monat
            System.out.println("\n");
        }
    }


























      /*  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geben Sie das gewünschte Datum im Format JJJJ-MM ein:");
            String inputDate = scanner.nextLine();

            try {
                String[] parts = inputDate.split("-");
                int year = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);

                // Beispielaufruf
                printCalendar("th-TH", year, month);

            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ungültiges Datumsformat. Verwenden Sie das Format JJJJ-MM.");
            }

            scanner.close();
        }

        public static void printCalendar(String localeString, int year, int month) {
            Locale locale = new Locale(localeString);
            Calendar calendar = new GregorianCalendar(locale);

            // Setze das Jahr und den Monat
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1); // Monate in Calendar sind 0-basiert

            // Setze den ersten Tag der Woche basierend auf dem Locale
            calendar.setFirstDayOfWeek(getFirstDayOfWeek(locale));

            // Gib das Datum aus
            System.out.printf("%d %02d\n", year, month);

            // Gib den Kalender aus
            printWeekHeader(locale);
            printCalendarBody(calendar);
            System.out.println();
        }

        private static void printWeekHeader(Locale locale) {
            Calendar calendar = new GregorianCalendar(locale);
            String[] weekdays = new String[7];

            // Bestimme die Wochentage basierend auf dem Locale
            for (int i = 1; i <= 7; i++) {
                calendar.set(Calendar.DAY_OF_WEEK, i);
                weekdays[i - 1] = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale);
            }

            // Ausgabe der Wochentage
            System.out.print("|");
            for (String weekday : weekdays) {
                System.out.printf(" %2s |", weekday);
            }
            System.out.println();
        }

        public static void printCalendarBody(Calendar calendar) {
            int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int currentDay = 1;

            while (currentDay <= maxDayOfMonth) {
                System.out.print("|");
                for (int i = 1; i <= 7; i++) {
                    if (currentDay <= maxDayOfMonth) {
                        if (i == calendar.get(Calendar.DAY_OF_WEEK)) {
                            System.out.printf("%3d*|", currentDay);
                        } else {
                            System.out.printf("%4d|", currentDay);
                        }
                        currentDay++;
                    } else {
                        System.out.print("    |");
                    }
                }
                System.out.println();
            }
        }

        public static int getFirstDayOfWeek(Locale locale) {
            Calendar calendar = new GregorianCalendar(locale);
            return calendar.getFirstDayOfWeek();
        }
    } */
