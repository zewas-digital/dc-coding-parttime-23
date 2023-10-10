/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/
import java.util.Scanner;
public class Refactor {
    public static void main(String[] args){
        Scanner inputKonsole = new Scanner(System.in);
        System.out.println("Gib die Größe des Quadrats an:");
        int Size = inputKonsole.nextInt();

        printsquare('X',Size);

        System.out.println("Gib die Höhe des Rechtecks an:");
        int high = inputKonsole.nextInt();
        System.out.println("Gib die Breite des Rechtecks an:");
        int width = inputKonsole.nextInt();

        printRect('X',width, high);
    }


    static void printsquare( char buchstabe, int anzahl) {
        for (int i = 0; i <anzahl; i++) {
            for ( int j = 0;  j< anzahl ; j++) {
                System.out.print(buchstabe);
            }
            System.out.println();
        }

    }
    static void printRect( char buchstabe, int breite, int höhe) {
        for (int i = 0; i <breite; i++) {
            for ( int j = 0;  j< höhe ; j++) {
                System.out.print(buchstabe);
            }
            System.out.println();
        }

    }
}
