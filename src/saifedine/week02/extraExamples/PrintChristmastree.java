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

        char zeichen = 'x';
        int size = 9;
        int mitte = (size-1) / 2;

        String value = String.valueOf(zeichen);

        for (int i = 0; i < size; i++) {
            System.out.print(value.repeat(i));
            System.out.println();
        }


    }
}
