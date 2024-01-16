package MichaelReal.week16_objects;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

public class Objekt_5_FotoapparatBonus {
        public static void main(String[] args) {
            // Erstelle ein Objektiv
            Objektiv objektiv1 = new Objektiv("EF-S 18-135mm", "Canon", 19.0);

            // Erstelle eine Speicherkarte
            Speicherkarte speicherkarte1 = new Speicherkarte("SanDisk Extreme Pro", "SanDisk", 128);

            // Erstelle einen Fotoapparat
            Fotoapparat kamera = new Fotoapparat(18.0, 55.0, "Canon EOS 90D", "Canon", 32);

            // Setze das aktive Objektiv und die aktive Speicherkarte
            kamera.setAktivesObjektiv(objektiv1);
            kamera.setAktiveSpeicherkarte(speicherkarte1);

            // Gib Informationen über den Fotoapparat aus
            System.out.println("Informationen über den Fotoapparat:");
            System.out.println(kamera);

            // Nehme ein Foto auf
            System.out.println("\nNehme ein Foto auf:");
            kamera.takePhoto();

            // Wechsle das Objektiv
            Objektiv objektiv2 = new Objektiv("EF 50mm f/1.8 STM", "Canon", 50.0);
            kamera.setAktivesObjektiv(objektiv2);

            // Wechsle die Speicherkarte
            Speicherkarte speicherkarte2 = new Speicherkarte("Samsung EVO Plus", "Samsung", 256);
            kamera.setAktiveSpeicherkarte(speicherkarte2);

            // Gib aktualisierte Informationen über den Fotoapparat aus
            System.out.println("\nNach dem Objektiv- und Speicherkartenwechsel:");
            System.out.println(kamera);

            // Zeige verfügbaren Speicherplatz auf der aktuellen Speicherkarte
            System.out.println("\nVerfügbarer Speicherplatz auf der aktuellen Speicherkarte:");
            int verfuegbarerSpeicher = speicherkarte2.verfuegbarerSpeicherplatz();
            System.out.println(verfuegbarerSpeicher + " MB verfügbar.");

            // Nehme weitere Fotos auf, um den Speicherplatz zu belegen
            System.out.println("\nNehme weitere Fotos auf:");
            for (int i = 0; i < 10; i++) {
                kamera.takePhoto();
            }

            // Gib erneut aktualisierte Informationen über den Fotoapparat aus
            System.out.println("\nNach weiteren Fotos:");
            System.out.println(kamera);

            // Zeige erneut verfügbaren Speicherplatz auf der aktuellen Speicherkarte
            System.out.println("\nVerfügbarer Speicherplatz auf der aktuellen Speicherkarte:");
            verfuegbarerSpeicher = speicherkarte2.verfuegbarerSpeicherplatz();
            System.out.println(verfuegbarerSpeicher + " MB verfügbar.");
        }
    }