package Matthias.week2.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,

von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.

Aufruf:
printSlash('x', 3, true);


Ausgabe:
x


 */
public class PrintSlash {

    static void printSlash(char buchstabe, int iZahl, boolean status){

        if (status == true) {
            System.out.println("Rechtunten");
            for (int i = 0; i < iZahl  ; i++) {
                System.out.print("Zeile: " + i +" ");

                for (int j = 0; j < iZahl ; j++) {
                    if (j==i) {
                        System.out.print(buchstabe);
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        if (status==false){
            System.out.println("Links oben");
            for (int i = 0; i < iZahl  ; i++) {
                System.out.print("Zeile: " + i +" ");

                for (int j = 0; j < iZahl ; j++) {

                    if (j + 1 ==iZahl-i) {
                        System.out.print(buchstabe);
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {

        printSlash('x', 3, true);
        printSlash('x', 3, false);

    }

}
