package Matthias.week11_weekend_calender;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von "DateTime.Parse() " veraltet !!!!!

verarbeitet. Als Ergebnis soll das Programm zurückgeben,an was für einem Wochentag der Geburtstag des Anwenders war.

  Sowieso Implementiert!!!1: Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {
    //Programmablauf
    //1. Klassen implementieren
    //2. Format für Kalender festlegen -> Greogranische Calender
    //3. Bentutzer Eingabe mit DataTimePase verabreiten
    //4. Ausgabe SOLL -> Ergebniss: Ausgabe des Wochentag des Programm Anwenders


    //Methoden Aufruf:

    //scanner aus der Klasse Random
    public static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        //Klassen des Kalenders

        Calendar c = Calendar.getInstance();

        // Format für den Kalender in einer Klasse Festlegen im Simple Date Formate

        SimpleDateFormat dateFormat = new SimpleDateFormat( "EEEE, d. MMMM yyyy HH:mm:ss.S z" );

        //Eingabe: Benutzer Eingabe -> Tag, Woche, Jahr
        System.out.print( "Tag:" );
        String Tag = scanner.nextLine( );
        System.out.print( "Woche:" );
        String Woche = scanner.nextLine( );
        System.out.print( "Jahr:" );
        String Jahr =scanner.nextLine();

        // Eingaben in int Konvertieren -> Dokumentation: https://codegym.cc/de/groups/posts/de.679.so-konvertieren-sie-string-in-java-in-int

        int TagInt = Integer.parseInt(Tag);
        int WocheInt = Integer.parseInt(Woche);
        int JahrInt= Integer.parseInt(Jahr);
        //Ausgabe Geburtsdatum
        System.out.println("Geburtsdatum");
        System.out.println("Tag:" + TagInt + "Woche:" + WocheInt+ "Jahr:" +JahrInt);

        //Ausgabe: für den Bentutzer-> Dokumentation: https://stackoverflow.com/questions/55070978/how-does-calender-setcalender-month-work

        c.set(Calendar.DAY_OF_MONTH,TagInt);
        c.set(Calendar.MONTH, WocheInt-1);
        c.set(Calendar.YEAR, JahrInt);
        System.out.println(dateFormat.format( c.getTime() ));
    }
}
