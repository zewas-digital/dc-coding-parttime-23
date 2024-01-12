package saifedine.week16_objects.oliver;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_FotoapparatBonus {
    public static void main(String[] args) {

        Fotoapparat sonyKamera = new Fotoapparat();
        Objektiv zoomObjektiv = new Objektiv(50);
        sonyKamera.verbindeObjektiv(zoomObjektiv);

        Fotoapparat canonKamera = new Fotoapparat();
        canonKamera.verbindeObjektiv(zoomObjektiv);

        sonyKamera.objektiv.brennweite = 1.9;
        canonKamera.objektiv.brennweite = 1.4;

        zoomObjektiv.brennweite = 1.1;

        System.out.println(sonyKamera.objektiv.brennweite);
        System.out.println(canonKamera.objektiv.brennweite);
    }
}
