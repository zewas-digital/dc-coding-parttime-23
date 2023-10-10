package solutions.michael_k.week2.example16;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

    Löse das Problem wie es dir gefällt
    Löse das Problem mit nur zwei ineinander verschachtelten Schleifen

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

public class PrintRhombus {
    public static void main(String[] args) {
        dreieck('x', 7);
    }

    static void dreieck( char buchstabe, int größe ) {
//__________________________________________________________________________
        for (int i = 0; i <größe/2; i++) {
            System.out.print("-");
        }
        System.out.print(buchstabe);

        for (int i = 0; i <größe/2; i++) {
            System.out.print("-");
        }
        System.out.println();
//__________________________________________________________________________
        int m =größe/2;
        int n =1;
        for (int i = 0; i < größe/2; i++) {

            for (int j = 1; j < m ; j++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.print(buchstabe);
            //__________________________________________________________________________
            for (int k = 0; k < n; k ++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.print(buchstabe);
            //__________________________________________________________________________
            for (int l = 1; l < m ; l++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.println();
            m--;
            n+=2;
        }
//__________________________________________________________________________
        m =1;
        n =größe-4;
        for (int i = 1; i < größe/2; i++) {

            for (int j = 0; j < m ; j++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.print(buchstabe);
            //__________________________________________________________________________
            for (int k = 0; k < n; k ++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.print(buchstabe);
            //__________________________________________________________________________
            for (int l = 0; l < m ; l++) {
                System.out.print("-");
            }
            //__________________________________________________________________________
            System.out.println();
            m++;
            n-=2;
//__________________________________________________________________________
        }
        for (int i = 0; i <größe/2; i++) {
            System.out.print("-");
        }
        System.out.print(buchstabe);

        for (int i = 0; i <größe/2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
   /* static void dreieck2( char buchstabe, int größe ){

        for (int i = 0; i <größe; i++) {
            for (int j = 0; j < 1; j++) {

            }
        }

    }*/
}
