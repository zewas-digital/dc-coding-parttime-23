package judith.week16_objects;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_FotoapparatBonus {

    public static void main(String[] args) {

        Objektiv zoomObjektiv = new Objektiv(20);
        Speicherkarte speicherkarte = new Speicherkarte(100.0);



        Fotoapparat canonKamera = new Fotoapparat();
        canonKamera.speicherkarteEinsetzen(speicherkarte);
        canonKamera.verbindeObjektiv(zoomObjektiv);
        canonKamera.setMegapixel(22.3F);


        Fotoapparat sonyKamera = new Fotoapparat();
        sonyKamera.verbindeObjektiv(zoomObjektiv);
        sonyKamera.speicherkarteEinsetzen(speicherkarte);
        sonyKamera.setMegapixel(20.5F);


        System.out.println("Canon " + canonKamera.objektiv);
        System.out.println("Canon " + canonKamera.speicherkarte);

        System.out.println("Sony " + sonyKamera.objektiv);
        System.out.println("Sony " + sonyKamera.speicherkarte);

        for (int i = 0; i < 5; i++) {
            sonyKamera.takePhoto();
        }

        sonyKamera.gemachteFotosUndRestspeicher();

    }

}
