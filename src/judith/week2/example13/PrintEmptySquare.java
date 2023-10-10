package solutions.judith.week2.example13;


import javax.swing.*;

/*
Erstellen Sie eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt. Der Quader soll innerhalb leer sein.


 */
public class PrintEmptySquare {

    public static void main(String[] args) {
        printEmptySquare('x', 10);
        printEmptySquare('A', 3);
    }

    private static void printEmptySquare(char value, int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0) {

                for (int j = 0; j < size; j++) {
                    System.out.print(value);
                }

                System.out.println();
            } else if (i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print(value);
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if ((j ==0 ) || (j == size - 1)) {
                        System.out.print(value);
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

        }
        System.out.println();
        System.out.println();
    }



}
