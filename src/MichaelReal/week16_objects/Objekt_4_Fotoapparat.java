package MichaelReal.week16_objects;

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
        Fotoapparat sony = new Fotoapparat(18, 55, "Ultra", "Sony", 24);

        //INFOS
        System.out.println("Infos der Kamera");
        System.out.println(sony);


        //FOTO MACHEN
        System.out.println("\nFotos aufnehmen:");
        sony.takePhoto();


        //ÄNDERN DER EINSTELLUNGEN
        System.out.println("\nÄndere die Brennweite von auf 50.0");
        sony.setBrennweiteMax(50.0);
        System.out.println(sony);
    }
}