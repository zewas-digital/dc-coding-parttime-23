package Matthias.week2;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

Aufruf:
printRhombus('x', 7);

Ausgabe:
   x
  x x
 x   x
x     x
 x   x
  x x
   x
 */

public class example_15_PrintRhombus {

    public static void main(String[] args){
        printRhombus('a', 8);// Aufruf zur Überprüfung, ob die Benutzer überprüfung überhaupt funktioniert
        printRhombus('a', 7);
    }
    static void printRhombus(char buchstabe, int höhedesrohmbus) {

        //Überprüfung ob die Eingabe des Benutzers überhaubt gültig für einen Rohmbus ist, ein Rohmbus
        if (höhedesrohmbus % 2==0){
            System.out.println("Fehler, Höhe muss ungerade sein!");
            return; // geht aus der Bendiung aus
        }
        System.out.println("Start");
        for (int i = 0; i < höhedesrohmbus; i++) {
            // Drucken der Höhe des Rohmbus
            System.out.print("Zeile = Höhe des Rohmbus: " + i );
            //Drucken der Breite des Rohmbus
            for (int j = 0; j < höhedesrohmbus; j++) {
                //Berechnung der Zeilenmitte
                int Zeilenmitte=((höhedesrohmbus-1)/2);
                // i enspricht der Zeile, sodass bei Zeile 0 und der letzen Zeile in der Zeilenmitte j ein Buchstabe gedruckt wird
                if ( (i==0||i==höhedesrohmbus-1) && j==Zeilenmitte) {
                    System.out.print( buchstabe );
                }else if ((j==0||j==höhedesrohmbus-1) && i==Zeilenmitte){
                    System.out.print( buchstabe );
                }
                else {
                    System.out.print( "_" );
                }
            }
            System.out.println(  );
        }
    }
}


