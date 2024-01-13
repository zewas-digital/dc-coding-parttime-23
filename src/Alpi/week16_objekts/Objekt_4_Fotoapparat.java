package Alpi.week16_objekts;

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
        Fotoapparat Sony = new Fotoapparat();
        Fotoapparat Canon = new Fotoapparat("Canon", "A50", 12, 24);
        Fotoapparat Nikkon  = new Fotoapparat("Nikkon", "D50", 40, 70);
        System.out.println("\n" + Sony);
        System.out.println("\n" + Canon);
        System.out.println("\n" + Nikkon);

        System.out.println("\nErstes Modell ist von Hersteller: " + Sony.getHersteller());
        System.out.println("Zweites Modell hat folgende Brennweite f: " + Canon.getBrennweite() + " mm");

        System.out.println("\nMach ein Foto mit Sony: ");
        Sony.takePhoto();
        System.out.println("\nMach ein Foto mit Nikkon: ");
        Nikkon.takePhoto();
    }
}
