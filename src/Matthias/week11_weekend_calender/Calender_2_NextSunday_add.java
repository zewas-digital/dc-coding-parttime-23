package Matthias.week11_weekend_calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calender_2_NextSunday_add {
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

        //-----------------Getten

        int tmp = ((1+7)-c.get(Calendar.DAY_OF_WEEK));

        //Variante 2: mit add

        c.add(Calendar.DAY_OF_MONTH, tmp);

        //Ausgabe Bentuzer: Hinweis -> add settet automatisch -> Dokumentation: https://stackoverflow.com/questions/55070978/how-does-calender-setcalender-month-work

        System.out.println(dateFormat.format( c.getTime() ));


    }
}
