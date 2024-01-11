package michael_k.week15;

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

        Fotoapparat fa1 = new Fotoapparat ( "Sony", "Alpha6000", "16/50", 24,  "2/22" );

        Fotoapparat fa2 = new Fotoapparat ( "Canon", "zx5", "18/55", 30,"4/18" );

        fa1.takePhoto();
        fa1.setIso ( 100 );

        System.out.println ( fa1.toString());
        System.out.println ( fa2.toString());


    }
}
