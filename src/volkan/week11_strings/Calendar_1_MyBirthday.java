package volkan.week11_strings;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {

    public static void main(String[] args) throws ParseException {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Geburtstag des Anwenders abfragen
        System.out.println("Bitte gib dein Geburtsdatum im Format TT.MM.JJJJ ein:");
        String birthdayString = scanner.nextLine();

        // Geburtstag in ein Date-Objekt konvertieren
        Date birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthdayString);

        // GregorianCalendar erstellen
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(birthday);

        // Wochentag des Geburtstags ermitteln
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Wochentag ausgeben
        System.out.println("Dein Geburtstag war ein " + getDayOfWeek(dayOfWeek));
    }

    public static String getDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Montag";
            case 2:
                return "Dienstag";
            case 3:
                return "Mittwoch";
            case 4:
                return "Donnerstag";
            case 5:
                return "Freitag";
            case 6:
                return "Samstag";
            case 7:
                return "Sonntag";
            default:
                return "Unbekannter Wochentag";
        }
    }
}

