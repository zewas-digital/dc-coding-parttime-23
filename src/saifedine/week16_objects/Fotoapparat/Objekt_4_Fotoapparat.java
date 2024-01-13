package saifedine.week16_objects.Fotoapparat;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), (?) Brennweite min/max, (2) Model, (1) Hersteller und (3) Megapixel.
Erstelle für die Attribute getter und setter
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Objekt_4_Fotoapparat {

    public static void main(String[] args) {

        // Fotoapparat nikon485U = new Fotoapparat("Nikon", "485U", 24.3F,50);

        System.out.println();

        Fotoapparat nikon485U = new Fotoapparat();

        nikon485U.setHersteller("Nikon");
        //System.out.println("Hersteller: " + nikon485U.getHersteller());

        nikon485U.setModel("485U");
        //System.out.println("Model: " + nikon485U.getModel());

        nikon485U.setMegapixel(24.3F);
        //System.out.println("Megapixel: " + nikon485U.getMegapixel());

        //nikon485U.setBrennweite(50);
        //System.out.println("Brennweite: " + nikon485U.getBrennweite());

        System.out.println(nikon485U);

        System.out.println();

        Fotoapparat canon780i = new Fotoapparat();
        canon780i.setHersteller("Canon");
        canon780i.setModel("780i");
        canon780i.setMegapixel(26.8F);
        //canon780i.setBrennweite(35);
        System.out.println(canon780i);

        System.out.println();

        nikon485U.takePhoto();

        for (int i = 0; i < 5; i++) {
            nikon485U.takePhoto();
        }

        System.out.println();

        System.out.println("Sie haben " + nikon485U.fotoCounter + " Fotos gemacht");

    }



}
