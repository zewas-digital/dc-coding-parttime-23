package michael_k.week15;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_Fotoapparat2_Bonus {

    public static void main(String[] args) {

        Fotoapparat2 fa1 = new Fotoapparat2 ( "Sony", "Alpha6000", 24 );
        Fotoapparat2 fa2 = new Fotoapparat2 ( "Canon", "CX3", 30 );
        Objektiv objektiv1 = new Objektiv ("16/50", "2/22");
        Objektiv objektiv2 = new Objektiv ("20/70", "5/18");
        Speicherkarte speicherkarte1 = new Speicherkarte ( 8000 );

        fa1.speicherkarteeinsetzen ( speicherkarte1 );
        fa1.objektivAufsetzen ( objektiv1 );

        System.out.println ( fa1.toString ());

        fa1.takePhoto();
        System.out.println ( fa1.toString ());

        fa1.takePhoto();
        System.out.println ( fa1.toString ());

        //Speicherkarte wird hier in die zweite Kamera eingesetzt
        System.out.println ( );
        System.out.println ( "Speicherkarte wird hier in die zweite Kamera eingesetzt");
        System.out.println ( );

        fa1.speicherkarteentfernen ();
        fa2.speicherkarteeinsetzen ( speicherkarte1 );
        fa2.objektivAufsetzen ( objektiv2 );

        System.out.println ( fa2.toString ());
        fa2.takePhoto ();
        System.out.println ( fa2.toString ());

        // Foto wird mit der ersten Kamera geschoßen ohne Speicherkarte
        System.out.println ( );
        fa1.takePhoto ();

    }
}
