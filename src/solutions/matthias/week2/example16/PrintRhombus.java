package solutions.matthias.week2.example16;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

 */

public class PrintRhombus {

    public static void main(String[] args){
        printRhombus('x', 7);
    }
    static void printRhombus(char buchstabe, int iZahl) {
        System.out.println("Start");
        for (int i = 0; i < iZahl; i++) {
            System.out.print("Zeile: " + i + " ");
            for (int j = 0; j < iZahl; j++) {
                if (i == (iZahl - 1) / 2) {
                    System.out.print(buchstabe);
                } else if (i % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(buchstabe);
                }
            }
            System.out.println();
        }


    }
}


