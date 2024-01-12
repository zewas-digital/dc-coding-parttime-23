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

        Fotoapparat nikon = new Fotoapparat("Nikon","Z8",45);

        Fotoapparat sony = new Fotoapparat("Sony", "ZV1",30);

        System.out.println(nikon);

    }
}
