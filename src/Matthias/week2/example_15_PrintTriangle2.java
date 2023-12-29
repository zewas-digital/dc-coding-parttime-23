package Matthias.week2;

/*
Erstelle eine Methode welche ein Dreick von variabler Größe und mit angegebene Zeichen ausgibt.
Dabei sollen die angegebene Größe die Höhe des Dreicks sein. Nimm an, dass die Zahl immer Ungerade ist.

Aufruf:
printTriangle('x', 3);

Ausgabe:
  x
 x x
xxxxx

Aufruf:
printTriangle('x', 5);

Ausgabe:
    x
   x x
  x   x
 x     x
xxxxxxxxx

*/


/*
Version von Michael
 */

public class example_15_PrintTriangle2 {
    public static void main(String[] args) {
        dreieck('x', 4);
    }

    static void dreieck( char buchstabe, int größe ) {
        for (int i = 0; i < größe-1; i++) { //-1 weil die letzte Zeile eigenständigt gedruckt wird -> vereinfacht den Druck vorgang
            //System.out.print( "Höhe: "+i ); // i enspricht der Höhe des Dreiecks
            for (int j = 0; j < (größe*2)-1; j++) {
                if ((j == größe - 1 - i)|| (j == größe - 1 + i)) {      //Berechungsformel für die Bestimmung der j Koordinaten an dehnen gedruckt werden soll!
                    System.out.print( buchstabe );
                }else {
                    System.out.print( "-" );
                }
            }
            System.out.println( );
        }
        //Druckt die Unterseite des Dreiecks
        for (int i = 0; i < 2 * größe- 1; i++) {
            System.out.print(buchstabe);
        }
        System.out.println();
    }
}
