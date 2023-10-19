package Alpi.week2.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,


 */
public class PrintSlash {


    public static void main(String[] args) {

        printSlash('x', 3);
    }

    static void printSlash (char value, int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {

            }
            for (int j = 0; j < size; j++) {
                System.out.print(value);
            }
            System.out.println('-');



        }
    }
}
