package Matthias.week15_objects;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Model, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Objekt_4_Fotoapparat {
    public static void main( String[] args ) {
        Fotokamera Fotoaparat1= new Fotokamera( "Sony","Alpha 4",50, 48 );
        System.out.println(  Fotoaparat1 );
        Fotoaparat1.setAufloesung( 55 );
        System.out.println(  Fotoaparat1 );
        Fotoaparat1.setBrennweite( 56 );
        System.out.println(  Fotoaparat1 );
        Fotoaparat1.setModell( "Beta" );
        System.out.println(  Fotoaparat1 );
        Fotoaparat1.setHersteller(  "Nikon" );
        System.out.println(  Fotoaparat1 );
        Fotoaparat1.takePhoto( true );
        System.out.println( "Hersteller: " + Fotoaparat1.getHersteller() +
                " Modell: "      +   Fotoaparat1.getModell()+
                " Brennweite: "  +   Fotoaparat1.getBrennweite( )+
                " Auflösung: "   +   Fotoaparat1.getAufloesung( ));

    }

}
