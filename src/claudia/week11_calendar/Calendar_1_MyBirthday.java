package claudia.week11_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import claudia.BasicFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Calendar_1_MyBirthday {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("EEEEE, dd. LLLL yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEEE");


        int year = BasicFunctions.readInt("\nGib Dein Geburtsjahr ein! ");
        int month = BasicFunctions.readInt("Monat? ");
        int day = BasicFunctions.readInt("Am wievielten? ");

        /*
        //Scanner sc = new Scanner(System.in);
        System.out.print("Gib Dein Geburtsdatum in folgendem Format ein: dd.mm.yyyy ");
        String date = sc.next();
        String[] datum = date.split("\\.");
        BasicFunctions.print1DArray(datum);
        */

        calendar.set(year, month - 1, day);

        //System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println("Dein Geburtstag war an einem " + (dateFormat1.format(calendar.getTime()).split(","))[0] + "!");
        System.out.println("Dein Geburtstag war an einem " + (dateFormat2.format(calendar.getTime()))+ "!");

    }

}
