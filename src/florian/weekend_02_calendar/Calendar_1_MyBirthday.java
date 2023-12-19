package florian.weekend_02_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet.
Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-y");
        Calendar calender = Calendar.getInstance();
        Calendar calender2 = Calendar.getInstance();

        Scanner userinput = new Scanner(System.in);
        System.out.println("Bitte gib dein Geburtstag ein: ");
        String birthday = userinput.next();
        System.out.println("Gib dein Geburtsmonat ein: ");
        String birthmonth = userinput.next();
        System.out.println("Bitte gib dein Geburtsjahr ein: ");
        String birthyear = userinput.next();
        // Umwandlung des Strings in Integer und Speichert den Wert
        int day = Integer.parseInt(birthday);
        int month = Integer.parseInt(birthmonth);
        int year = Integer.parseInt(birthyear);

        // Erste Lösungsweg
        calender.set(Calendar.DAY_OF_MONTH, day + 8);
        calender.set(Calendar.MONTH, month - 1);
        calender.set(Calendar.YEAR, year);
        System.out.println();
        System.out.println("Dein Geburtstag ist am: " + dateFormat.format(calender.getTime()));

        System.out.println();
        // Zweiter Lösungsweg
        calender2.set(year,month -1,day);
        System.out.println("Dein Geburtstag ist am: " + dateFormat.format(calender2.getTime()));
    }

}
