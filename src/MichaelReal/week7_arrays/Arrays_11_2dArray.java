package MichaelReal.week7_arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */



import java.util.Scanner;

public class Arrays_11_2dArray {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Benutzer nach den Dimensionen des Arrays fragen
                System.out.print("Geben Sie die Anzahl der Zeilen ein: ");
                int rows = scanner.nextInt();
                System.out.print("Geben Sie die Anzahl der Spalten ein: ");
                int columns = scanner.nextInt();

               /* // Das 2D-Array erstellen
                int[][] array = new int[rows][columns];

                // Das Array mit Zufallszahlen von 0 bis 100 befüllen
                Random random = new Random();
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        array[i][j] = random.nextInt(101); // 0 bis 100
                    }
                }*/

                int[][] array = ArrayMethods.createRandom2dArray(5, 5);

                ArrayMethods.print2dArray(array);


                // Die Summe pro Zeile ausgeben
                System.out.println("Summe pro Zeile:");
                for (int i = 0; i < rows; i++) {
                    int rowSum = 0;
                    for (int j = 0; j < columns; j++) {
                        rowSum += array[i][j];
                    }
                    System.out.println("Zeile " + i + ": " + rowSum);
                }

                // Die Summe pro Spalte ausgeben
                System.out.println("Summe pro Spalte:");
                for (int j = 0; j < columns; j++) {
                    int colSum = 0;
                    for (int i = 0; i < rows; i++) {
                        colSum += array[i][j];
                    }
                    System.out.println("Spalte " + j + ": " + colSum);
                }
            }
        }


