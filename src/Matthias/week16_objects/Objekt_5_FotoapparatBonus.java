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
        Objektiv_5 Objektiv=new Objektiv_5( 50 );
        Speicherkarte_5 Speicherkarte = new Speicherkarte_5( 25 );
        Fotokamara1.setObjektiv(  Objektiv);
        Fotokamara1.setSpeicherkarte( Speicherkarte );
        System.out.println( Fotokamara1 );
        Fotokamara1.objektiv.brennweite=60;
        System.out.println( Fotokamara1 );
        Fotokamara1.takePhoto( true );
        Fotokamara1.takePhoto( true );
        System.out.println(Fotokamara1.speicherkarte.getSpeicherplatzStatus() );
        System.out.println(Fotokamara1.speicherkarte.getAnzahlderFotos() );



    }
}
