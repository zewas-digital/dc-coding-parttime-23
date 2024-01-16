package Matthias.week16_objects;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_FotoapparatBonus {
    public static void main( String[] args ) {

        Fotokamera_5 Fotokamara1= new Fotokamera_5( "Sony","Alpha 4",48 );
        Fotokamera_5 Fotokamara2= new Fotokamera_5( "Nikon","Alpha 4",48 );

        Objektiv_5 schmallwinkel=new Objektiv_5( 50 );
        Objektiv_5 breitwinkel=new Objektiv_5( 120 );

        Speicherkarte_5 Speicherkarte = new Speicherkarte_5( 25 );
        Speicherkarte_5 Speicherkarte2 = new Speicherkarte_5( 23);

        Fotokamara1.setObjektiv(  schmallwinkel);
        Fotokamara1.setSpeicherkarte( Speicherkarte );

        Fotokamara2.setObjektiv(  breitwinkel);
        Fotokamara2.setSpeicherkarte( Speicherkarte2 );

        System.out.println( Fotokamara1 );
        System.out.println( Fotokamara2 );

        Objektiv_5 Objetivbox=Fotokamara1.getObjektiv();

        Speicherkarte_5 Speicherbox=Fotokamara1.getSpeicherkarte();

        Fotokamara1.setObjektiv(Fotokamara2.getObjektiv());

        Fotokamara1.setSpeicherkarte(Fotokamara2.getSpeicherkarte());

        Fotokamara2.setObjektiv( Objetivbox);
        Fotokamara2.setSpeicherkarte( Speicherbox);

        Fotokamara1.takePhoto( true );
        Fotokamara2.takePhoto( true );

        System.out.println(Fotokamara1.speicherkarte.getSpeicherplatzStatus() );
        System.out.println(Fotokamara1.speicherkarte.getAnzahlderFotos() );

        System.out.println( Fotokamara1 );
        System.out.println( Fotokamara2 );


    }
}
