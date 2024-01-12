package saifedine.week16_objects.Fotoapparat;

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

        sonyKamera.setHersteller("Sony");
        sonyKamera.setModel("8747");
        sonyKamera.setMegapixel(22.3F);


        Fotoapparat canonKamera = new Fotoapparat();
        canonKamera.verbindeObjektiv(zoomObjektiv);

        sonyKamera.objektiv.brennweite = 1.9;
        canonKamera.objektiv.brennweite = 1.4;

        zoomObjektiv.brennweite = 1.1;

        System.out.println();

        // da beide Fotoapparat Instanzen das selbe Objektiv (zoomObjektiv) verwenden, wird im sout unten der Wert von zoomObjektiv.brennweite (1.1) verwendet.
        System.out.println("Sony: " + sonyKamera.objektiv.brennweite);
        System.out.println("Canon: " + canonKamera.objektiv.brennweite);

        Speicherkarte sd100 = new Speicherkarte(100.0F);
        sonyKamera.verbindeSpeicherkarte(sd100);

        //System.out.println("\n" + sonyKamera.speicherkarte.speicher + "\n");
        System.out.println("\n" + sd100.speicher + "\n");

        System.out.println("\n" + sonyKamera + "\n");

        sonyKamera.takePhoto();

        for (int i = 0; i < 5; i++) {
            sonyKamera.takePhoto();
        }

        //System.out.println("\n" + "Sie haben " + sonyKamera.fotoCounter + " Fotos gemacht" + "\n");

        sonyKamera.gemachteFotosMitRestspeicher();
    }
}
