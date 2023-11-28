package Matthias.week2;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

 */

public class example_15_PrintRhombus {

    public static void main(String[] args){
        printRhombus('1', 7);
    }
    static void printRhombus(char buchstabe, int iZahl) {
        System.out.println("Start");
        for (int i = 0; i < iZahl; i++) {
            System.out.print("Zeile: " + i + " ");
            for (int j = 0; j < iZahl; j++) {
                if (j == ((iZahl - 1) / 2) || (i == (iZahl - 1)/2 )) {
                    System.out.print(buchstabe);
                } else if ((j % 2 == 1) && (i % 2 == 0)  ) {
                    System.out.print("2");
                } else if (j%2==0 ){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }


    }
}


