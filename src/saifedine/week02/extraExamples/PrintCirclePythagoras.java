package saifedine.week02.extraExamples;

/*
Erstelle eine Methode welche einen ausgefüllten Kreis von variabler Größe ausgibt.
Der Radius des Kreises soll als Parameter übergeben werden können.

Verwende dazu den Satz des Pythagoras: a^2 + b^2 = c^2

Eine Zeile des IntelliJ Terminals ist etwa 2.6 * höher als ein Zeichen breit ist, dadurch sieht die Ausgabe verzerrt aus.

Aufruf:
printCirclePythagoras(10);

Ausgabe:
      XXXXXXXXX
     XXXXXXXXXXX
   XXXXXXXXXXXXXXX
   XXXXXXXXXXXXXXX
  XXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXX
  XXXXXXXXXXXXXXXXX
   XXXXXXXXXXXXXXX
   XXXXXXXXXXXXXXX
     XXXXXXXXXXX
      XXXXXXXXX
 */

public class PrintCirclePythagoras {

    public static void main(String[] args) {

        printCirclePythagoras(10);
    }

    public static void printCirclePythagoras(int radius) { // Methode zum Drucken eines Kreises mit variabler Größe

        int diameter = 2 * radius; // Durchmesser des Kreises berechnen

        for (int i = 0; i < diameter; i++) { // Schleife für die Höhe des Kreises
            for (int j = 0; j < diameter; j++) { // Schleife für die Breite des Kreises

                int x = i - radius; // x-Koordinate relativ zum Mittelpunkt des Kreises
                int y = j - radius; // y-Koordinate relativ zum Mittelpunkt des Kreises

                double distance = Math.sqrt(x * x + y * y); // Abstand vom Mittelpunkt berechnen (Satz des Pythagoras)

                if (distance < radius) { // Prüfen, ob der Punkt innerhalb des Kreises liegt
                    System.out.print("X"); // Punkt innerhalb des Kreises: drucke "X"
                } else {
                    System.out.print(" "); // Punkt außerhalb des Kreises: drucke Leerzeichen
                }
            }
            System.out.println(); // Zeilenumbruch nach jedem Durchlauf der äußeren Schleife
        }
    }
}