package judith.weekend2;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */



// Scanner (Geburtsdatum) Entweder Jahr, Monat, Tag abfragen oder gleich das ganze Datum eingeben lassen - String.spilt "." - als INT speichern
//Eingabe in INT konvertieren
//Calendar.c erstellen
// Calendar(c).set - (Jahr,Monat,Tag)
//String format() oder SimleDateFormat




import javax.swing.text.html.HTML;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;



public class Calendar_1_MyBirthday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie ihr Geburtsdatum ein TT.MM.JJJJ");
        String datum = sc.nextLine();
        String[] split = datum.split("\\.");
        //System.out.println(Arrays.toString(split));
        int day = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int year = Integer.parseInt(split[2]);

       // System.out.println(day + "." + month + "." + year);

        Calendar c = Calendar.getInstance();

        c.set(year,(month-1),day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        System.out.println(dateFormat.format(c.getTime())); // Damit wird der Wochentag berechnet.

    }

}
