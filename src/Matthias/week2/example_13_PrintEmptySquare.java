package Matthias.week2;


public class example_13_PrintEmptySquare {

    static void printEmptySquare(char buchstabe, int seitenlänge){

        for (int i = 0; i < seitenlänge  ; i++) {
            System.out.print("Zeile: " + i +" ");

            for (int j = 0; j < seitenlänge ; j++) {

                if (i == seitenlänge-1) {
                    System.out.print(buchstabe);
                }else if (i == 0) {
                    System.out.print(buchstabe);
                } else if (j==seitenlänge-1) {
                    System.out.print(buchstabe);
                }else if (j==0) {
                    System.out.print(buchstabe);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printEmptySquare('x', 10);
        printEmptySquare('A', 3);
    }

}
