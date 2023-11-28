package saifedine.week11_weekend2_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


// 1. Geburtsdatum scanner
// 2. Eingaben in int konvertieren
// 3. Calender c erstellen
// 4. c set (year, month, day) --> set(int year, int month, int date) = Methode in Calender
// 5. String format() oder SimpleDateFormat
// alternativ --> String, dann Split --> Siehe Slack, Variante von Judith

public class Calendar_1_MyBirthday {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie Ihr Geburtsjahr in folgendem Format: yyyy");
        int year = input.nextInt();
        //System.out.println("Ihr Geburtsjahr ist: " + year);
        System.out.println("Geben Sie Ihr Geburtsmonat in folgendem Format: MM");
        int month = input.nextInt();
        //System.out.println("Ihr Geburtsmonat ist: " + month);
        System.out.println("Geben Sie Ihr Geburtstag in folgendem Format: dd");
        int day = input.nextInt();
        //System.out.println("Ihr Geburtstag ist: " + day);
        System.out.println("Ihre Geburtstag ist am: " + day + "." + month + "." + year);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,(month-1),day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        System.out.println("Der Wochentag ist " + dateFormat.format(calendar.getTime()));
    }
}
