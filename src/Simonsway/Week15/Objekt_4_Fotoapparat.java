package Simonsway.Week15;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Model, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Objekt_4_Fotoapparat {

    public static void main(String[] args) {

        Kamera kamera1 = new Kamera();
        kamera1.setModelBezeichnung("Nikon D750");
        kamera1.setHersteller("Nikon");
        kamera1.setBrennweiteMin(24);
        kamera1.setBrennweiteMax(120);
        kamera1.setMegapixel(24.3);
        System.out.println("Hersteller " + kamera1.getHersteller());
        System.out.println("Model " + kamera1.getModellBezeichnung());
        System.out.println("Megalpixel " + kamera1.getMegapixel());
        System.out.println("Brennweite Min " + kamera1.getBrennweiteMin());
        System.out.println("Brennweite Max " + kamera1.getBrennweiteMax());

        System.out.println("------------------------------------");


    }

}
