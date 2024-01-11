package claudia.week16_objects.fotoapparat;

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

        Fotoapparat fa1 = new Fotoapparat("Sony", "XYZ", 20);

        System.out.println("\nNeuer Fotoapparat erzeugt:\n" + fa1);
        System.out.println("\nSetze Normalobjektiv ein: ");
        fa1.setObjektiv(normalesObjektiv);
        System.out.println(fa1.getObjektiv().toString());

        System.out.println("\nWechsel zu Weitwinkelobjektiv: ");
        fa1.setObjektiv(weitwinkelObjektiv);
        System.out.println("Neue Werte: \n" + fa1);
        System.out.println(fa1.getObjektiv());

        System.out.println("\nSpeicherkarte einsetzen: ");
        fa1.setSpeicherkarte(sk1);
        System.out.println("Speicherkapazität gesamt: " + sk1.getMemoryTotal() + " GB");

        System.out.println("\nMach ein Foto: ");
        fa1.takePhoto(1);

        System.out.println("Entferne Objektiv!");
        fa1.entferneObjektiv();
        System.out.println("\nMach 10 Fotos: ");
        fa1.takePhoto(10);

        System.out.println("\nEntferne Speicherkarte, versuch noch ein Foto: ");
        fa1.setSpeicherkarte(null);
        fa1.takePhoto(1);

        System.out.println("\nNeue Kamera mit Teleojektiv: ");
        Fotoapparat fa2 = new Fotoapparat("Canon", "A1", 40);
        fa2.setObjektiv(teleObjektiv);
        System.out.println("\n" + fa2 + "\n" + teleObjektiv);
        System.out.println("\nVerwende dieselbe Speicherkarte, mach zwei Fotos: ");
        fa2.setSpeicherkarte(sk1);
        fa2.takePhoto(2);
    }
}
