package florian.week_15_objects;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_FotoapparatBonus {
    public static void main(String[] args) {


        Objektiv breitobjektiv = new Objektiv(50);
        Objektiv weitWinkelObjektiv = new Objektiv(110);
        Speicherkarte speicherkarte = new Speicherkarte(100,0);

        Fotoapparat sony = new Fotoapparat("Sony", "ZV1",30,weitWinkelObjektiv,speicherkarte);

        Fotoapparat nikon = new Fotoapparat("Nikon","Z8",45,breitobjektiv,speicherkarte);


        // Mit Methode gewechselt und Objektiv auf private gesetzt

        sony.objektiventfernen();
        sony.objektiveinsetzen(breitobjektiv);
        nikon.objektiveinsetzen(weitWinkelObjektiv);

        /* ohne Methode gewechselt, geht nur mit public

        sony.objektiv = null;
        nikon.objektiv = weitWinkelObjektiv;
        sony.objektiv = breitobjektiv;
         */



        sony.fotomachen(8);



        sony.speicherkarte.restSpeicherplatz();

        nikon.speicherkarte.restSpeicherplatz();


        System.out.println(sony);

        System.out.println(nikon);



    }
}
