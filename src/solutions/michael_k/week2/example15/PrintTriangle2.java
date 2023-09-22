package solutions.michael_k.week2.example15;

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

public class PrintTriangle2 {
    public static void main(String[] args) {
        dreieck('x', 4);
    }

    static void dreieck( char buchstabe, int größe ) {
//__________________________________________________________________________
        for (int i = 1; i <größe; i++) {
            System.out.print("-");
        }
        System.out.print(buchstabe);

        for (int i = 1; i <größe; i++) {
            System.out.print("-");
        }
        System.out.println();

        int m =größe;
        int n =1;
        for (int i = 0; i < größe-2; i++) {
//__________________________________________________________________________
            for (int j = 1; j < m - 1; j++) {
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
            for (int l = 1; l < m - 1; l++) {
                System.out.print("-");
            }
//__________________________________________________________________________
            System.out.println();
            m--;
            n+=2;
        }
        for (int i = 0; i < größe*2-1; i++) {
            System.out.print(buchstabe);
        }
    }
}
