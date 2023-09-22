package solutions.matthias.week2.example12;
/*
Erstellen Sie vier Methoden welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
Die Methode hat 2 Übergabeparameter und keinen Rückgabeparameter. Für jede Methode soll es eine andere Ausrichtung geben.

 */

public class PrintTriangle {
    //Methoden definieren

    //Methode 1
    static void printTriangleBottomLeft(char cZeichen, int iAnzahl){
        for (int i = 1; i <=iAnzahl ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cZeichen);
            }
            System.out.println();
        }


    }

    //Methode 2
    static void printTriangleTopLeft(char cZeichen, int iAnzahl){
        for (int i = 1; i <=iAnzahl ; i++) {
            for (int j = iAnzahl; j >= i; j--) {
                System.out.print(cZeichen);
            }

            System.out.println();
        }
    }

    //Methode 3
    static void printTriangleTopRight(char cZeichen, int iAnzahl){
        for (int i = 0; i < iAnzahl  ; i++) {

            for (int j = 0; j < iAnzahl; j++) {

                if (i > j ) {
                    System.out.print("-");
                }else{
                    System.out.print(cZeichen);
                }

            }
            System.out.println();
        }

    }

    // Methode 4
    static void printTriangleBottomRight(char cZeichen, int iAnzahl){
        for (int i = 0; i <=iAnzahl ; i++) {

            for (int j = 0; j < iAnzahl; j++) {

                if (j < iAnzahl-i ) {
                    System.out.print("-");

                }else{
                    System.out.print(cZeichen);
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //printTriangleBottomLeft('x', 4);
        //printTriangleTopLeft('x', 5);
        printTriangleTopRight('x', 5);
        //printTriangleBottomRight('x', 5);
    }
}
