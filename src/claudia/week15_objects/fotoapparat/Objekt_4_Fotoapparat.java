package claudia.week15_objects.fotoapparat;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Modell, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Objekt_4_Fotoapparat {
    public static void main(String[] args) {
        Fotoapparat fa1 = new Fotoapparat();
        Fotoapparat fa2 = new Fotoapparat("Canon", "ABC", 12, 24);
        Fotoapparat fa3 = new Fotoapparat("Kodak", "Pixpro", 40, 70);
        System.out.println("\n" + fa1);
        System.out.println("\n" + fa2);
        System.out.println("\n" + fa3);

        System.out.println("\nErstes Modell ist von Hersteller: " + fa1.getHersteller());
        System.out.println("Zweites Modell hat folgende Brennweite f: " + fa2.getBrennweite() + " mm");

        System.out.println("\nMach ein Foto mit fa1: ");
        fa1.takePhoto();
        System.out.println("\nMach ein Foto mit fa3: ");
        fa3.takePhoto();
    }
}
