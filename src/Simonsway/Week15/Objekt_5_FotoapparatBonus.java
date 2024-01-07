package Simonsway.Week15;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

import java.util.Scanner;

public class Objekt_5_FotoapparatBonus {

    public static void main(String[] args) {

    controler();

    }

    public static void controler(){

        Scanner scanner = new Scanner(System.in);

        Kamera kamera1 = new Kamera();
        Speicherkarte speicherkarte1 = new Speicherkarte(kamera1);
        Model model1 = new Model(kamera1);

        kamera1.setMegapixel(24.3);

        System.out.println("Fotoapparat bereit zum Fotografieren bitte funktion wählen");
        System.out.println("1. Foto schießen");
        System.out.println("2. Speicherplatz abfragen");
        System.out.println("3. Anzahl der Fotos abfragen");
        System.out.println("4. Objektiv wechseln");
        System.out.println("5. Speicherkarte wechseln 16GB, 32GB, 64GB, 128GB");
        System.out.println("6. Fotoapparat ausschalten");
        System.out.println();

        if (scanner.nextInt() == 1) {
            System.out.println("Foto schießen");
            kamera1.takePhoto(scanner.nextInt());
        } else if (scanner.nextInt() == 2) {
            speicherkarte1.berechneSpeicherplatz();
        } else if (scanner.nextInt() == 3) {
            model1.nikonD750();
        } else if (scanner.nextInt() == 4) {
            System.out.println("Objektiv wechseln");
        } else {
            System.out.println("Falsche Eingabe");
        }
    }

}
