package solutions.judith.week2.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,


 */
public class PrintSlash {
    public static void main(String[] args) {
        printSlash('x', 3);

    }
    static void printSlash(char value,int size) {
        // Aufgabe wie Nr 12 aber nicht jeden Wert ausgeben??
        // Einfache Möglichkeit wäre beide Varianten links und rechts in Abzubilden und mit einer True und fals abzufragen

        for (int i = 0; i <size ; i++) {
            if (i==0){
                System.out.print(value);
            }
            else {
                System.out.print(" ");
            }
            System.out.println();
            for (int j = 0; j <size ; j++) {
                if (j==2){
                    System.out.print(value);
                }
                else {
                    System.out.print(" ");
                }

            }
        }

    }
}
