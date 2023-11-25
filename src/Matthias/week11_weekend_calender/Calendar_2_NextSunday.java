package Matthias.week11_weekend_calender;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_2_NextSunday {
    public static Scanner scanner = new Scanner( System.in );

    //Klassen des Kalenders

    Calendar c = Calendar.getInstance();
    //Start Main Programm
    public static void main( String[] args ) {

        //Klassen des Kalenders

        Calendar c = Calendar.getInstance();

        // Format für den Kalender in einer Klasse Festlegen im Simple Date Formate

        SimpleDateFormat dateFormat = new SimpleDateFormat( "EEEE, dd. MMMM yyyy" );

        //Eingabe: Benutzer Eingabe -> Tag, Woche, Jahr
        System.out.print( "Tag:" );
        String Tag = scanner.nextLine( );
        System.out.print( "Monat:" );
        String Monat = scanner.nextLine( );
        System.out.print( "Jahr:" );
        String Jahr =scanner.nextLine();

        // Eingaben in int Konvertieren -> Dokumentation: https://codegym.cc/de/groups/posts/de.679.so-konvertieren-sie-string-in-java-in-int

        int TagInt = Integer.parseInt(Tag);
        int MonatInt = Integer.parseInt(Monat);
        int JahrInt= Integer.parseInt(Jahr);
        //Ausgabe Geburtsdatum
        System.out.println("Geburtsdatum");
        System.out.println("Tag:" + TagInt + "Woche:" + MonatInt+ "Jahr:" +JahrInt);


        //Setten
        c.set(Calendar.DAY_OF_MONTH,TagInt);
        c.set(Calendar.MONTH, MonatInt-1);
        c.set(Calendar.YEAR, JahrInt);

        //Ausgabe: für den Bentutzer-> Dokumentation: https://stackoverflow.com/questions/55070978/how-does-calender-setcalender-month-work
        System.out.println(dateFormat.format( c.getTime() ));

        int tmp = ((1+7)-c.get(Calendar.DAY_OF_WEEK));
        // Variante 1: ohne Add
        c.set(Calendar.DAY_OF_MONTH, (TagInt+tmp));
        c.set(Calendar.MONTH, (MonatInt-1));
        c.set(Calendar.YEAR, JahrInt);

        System.out.println(dateFormat.format( c.getTime() ));

        //Variante 2: mit add

        //Setten
        c.set(Calendar.DAY_OF_MONTH,TagInt);
        c.set(Calendar.MONTH, MonatInt-1);
        c.set(Calendar.YEAR, JahrInt);
        //Getten
        c.set(Calendar.YEAR, JahrInt);
        c.set(Calendar.MONTH, (MonatInt-1));
        c.add(Calendar.DAY_OF_MONTH, tmp);

        System.out.println(dateFormat.format( c.getTime() ));
        //c.get(Calendar.getInstance( ).getFirstDayOfWeek( ) ), TagInt+8);

    }
}
