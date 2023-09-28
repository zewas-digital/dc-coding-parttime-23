/*
for ( let i=0; i<=9; i++ ) {
          |     |    |
          |     |    +---> Schritt-Anweisung (Increment)
          |     |
          |     +---> Bedingung
          |
          +---> Anfangs-Ausdruck

   … Anweisungen: Mach was mit i …
}

 */

/*

----*
---*-
--*--
-*---
*----

 */

package solutions.marcelsimma.weekend1;

public class Slash {


    public static void main(String[] args) {

        for (int y = 1; y <= 10; y++) {
            System.out.println(y + "er Reihe");
            for (int x = 1; x <= 10; x++) {
                System.out.println(y + " * " + x + " = " + y * x);
            }
            System.out.println();
        }
        System.out.println("10");
    }
}



/*
Solution:
int size = 5;

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (x == size - y - 1) {
                    System.out.print("*");

                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
 */