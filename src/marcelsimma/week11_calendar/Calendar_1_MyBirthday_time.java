package marcelsimma.week11_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Calendar_1_MyBirthday_time {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Eingabe des Geburtsdatums im deutschen Format (DD.MM.YYYY)
            System.out.println("Geben Sie das Geburtsdatum im deutschen Format (TT.MM.JJJJ) ein:");
            String inputDate = scanner.nextLine();

            // Festlegung des deutschen Datumsformats
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMANY);
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Ermittlung des Wochentags
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            String wochentag = dayOfWeek.toString();

            System.out.println("Der Wochentag des Geburtsdatums " + inputDate + " ist: " + wochentag);
        }
    }


