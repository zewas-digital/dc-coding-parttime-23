package claudia.weekend1.example26;
import java.util.Scanner;
public class Refactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char wahl = ' ';
        while (wahl != 'L' && wahl != 'A') {
            System.out.print("Leeres oder ausgefülltes Quadrat. 'L' für Leer, 'A' für ausgefüllt: ");
            wahl = scanner.next().charAt(0);
        }

        System.out.print("Bitte Größe eingeben: ");
        int size = scanner.nextInt();
        System.out.print("Bitte Lieblingszeichen aussuchen: ");
        char zeichen = scanner.next().charAt(0);

        if (wahl == 'L') printEmptySquare(zeichen, size);
        else if (wahl == 'A') printSquare(zeichen, size);
        else System.out.println("Falsche Wahl!");


    }
    static void printEmptySquare(char c, int size){
            //erste Zeile
            for (int i = 0; i < size; i++) {
                System.out.print(c);
            }
            System.out.println();
            //Mittelteil
            for (int i = 1; i < size-1; i++) {
                System.out.print(c);
                for (int j = 1; j < size-1; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            //letzte Zeile
            for (int i = 0; i < size; i++) {
                System.out.print(c);
            }
            System.out.println();
        }
        static void printSquare(char c, int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }


        }}
