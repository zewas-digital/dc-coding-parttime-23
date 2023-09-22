package solutions.michael_k.week2.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,
weiters soll der Parameter backslash angegeben werden können. Wenn backslash wahr ist, soll die Diagonale
von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.

Aufruf:
printSlash('x', 3, true);

Ausgabe:
x
 x
  x

Aufruf:
printSlash('y', 4 false);

Ausgabe:
   y
  y
 y
y

 */
public class PrintSlash {

    public static void main(String[] args){

        printslash('X', 10, true);
    }

    static void printslash( char buchstabe, int größe, boolean richtung) {

       if (richtung != true) {
           int l = 0;

           for (int i = 0; i < größe; i++) {

               for (int k = größe - 1; k != l; k--) {
                   System.out.print(" ");
               }
               System.out.print(buchstabe);

               System.out.println();
               l++;
           }
       }
       else {
            int m=größe;

            for (int i = 0; i <größe; i++) {

                 for (int k = größe; k>m; k--) {
                  System.out.print(" ");
                 }
            System.out.print(buchstabe);
                 System.out.println();
            m--;
            }
       }
    }
}
