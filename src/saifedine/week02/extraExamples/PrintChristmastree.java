package saifedine.week02.extraExamples;

/*
 Erstelle eine Methode welche einen Christbaum von variabler Größe ausgibt.
 Teile das Problem in kleinere Probleme auf!

 Aufruf:
 printChristmasTree(9);

 Ausgabe:
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************
O O O O O O O O O
      +++++
      +++++

 */

public class PrintChristmastree {

    public static void main(String[] args) {

        printChristmasTree(9);
    }

    public static void printChristmasTree(int size) { // Methode zum Drucken des Christbaums mit variabler Größe

        for (int i = 0; i < size; i++) { // Schleife für die Höhe des Baums
            for (int j = 0; j < size - i - 1; j++) { // Schleife für die Leerzeichen vor den Sternen
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) { // Schleife für die Sterne
                System.out.print("*");
            }
            System.out.println(); // Zeilenumbruch nach jedem Durchlauf der äußeren Schleife
        }

        System.out.println("O O O O O O O O O"); // Druck der Kugeln am Baumstamm

        for (int n = 0; n < size - 3; n++) { // Schleife für die Äste des Baums
            System.out.print(" ");
        }
        System.out.println("+++++"); // Druck der Äste

        for (int o = 0; o < size - 3; o++) { // Schleife für die Äste des Baums
            System.out.print(" ");
        }
        System.out.println("+++++"); // Druck der Äste
    }
}