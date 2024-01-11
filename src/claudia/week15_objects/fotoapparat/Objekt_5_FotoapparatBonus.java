package claudia.week15_objects.fotoapparat;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.

1 GB = 1024 MB = 2^30 Byte
1 MB = 1024 KB = 2^20 Byte
1 KB = 1024 Byte = 2^10 Byte

Objektiv Weitwinkel: Brennweite 10 - 28
Objektiv normal: Brennweite 50
Objektiv Tele: 70 - 200

Speicherkarte normal: 2 GB
Speicherkarte High-Capacity: 32 GB
Speicherkarte Extended-Capacity: 128 GB


 */

public class Objekt_5_FotoapparatBonus {
    public static void main(String[] args) {
        Objektiv weitwinkelObjektiv = new Objektiv(10);
        Objektiv normalesObjektiv = new Objektiv(50);
        Objektiv teleObjektiv = new Objektiv(100);

        Speicherkarte sk1 = new Speicherkarte(2);

        System.out.println("\nWeitwinkelobjektiv: " + weitwinkelObjektiv);

        Fotoapparat fa1 = new Fotoapparat("Sony", "XYZ", 20, normalesObjektiv, sk1);
        //Fotoapparat fa2 = new Fotoapparat("Canon", "ABC", 20, 24);

        System.out.println("\nNeuer Fotoapparat erzeugt mit Normalobjektiv:\n" + fa1);
        System.out.println(fa1.getObjektiv().toString());

        System.out.println("\nWechsel des Objektivs: ");
        fa1.setObjektiv(teleObjektiv);
        System.out.println("Neue Werte: \n" + fa1);
        System.out.println(fa1.getObjektiv());

        //System.out.println("\nNeuer einfacher Fotoapparat erzeugt: " + fa2);

        System.out.println("\nMach ein Foto: ");
        fa1.takePhoto();
        System.out.println("\nMach 10 Fotos: ");
        for (int i = 0; i < 10; i++) {
            fa1.takePhoto();
        }

        System.out.println("\nEntferne Speicherkarte, versuch noch ein Foto: ");
        fa1.setSpeicherkarte(null);
        fa1.takePhoto();

    }
}
