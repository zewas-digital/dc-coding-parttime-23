package solutions.claudia.week2.example16;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

   x
 */

//erste Zeile: Zeichen auf 0,5 * (height - 1)
//dann: Zeichen auf 0,5 * (height - 1) +/- i
//bis Zeile 0,5 * (height - 1)
//danach Zeichen bei (height - i) +/- 1
//letzte Zeile Zeichen bei 0,5 * (height - 1)

public class PrintRhombus {

    public static void main(String[] args) {
        printRhombus('x', 7);
        printRhombus('*', 11);
        printRhombus('*', 4);
    }

    static void printRhombus(char c, int height) {

        if (height % 2 == 0){
            System.out.println("Fehler, Höhe muss ungerade sein!");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {

                //obere Hälfte
                if (i <= 0.5 * height) {
                    if ((j == 0.5 * (height - 1) - i) || (j == 0.5 * (height - 1) + i)) {
                        System.out.print(c);
                    } else System.out.print('-');
                }

                //untere Hälfte
                else if((j == -0.5 * (height - 1) + i ) || (j == 1.5 * (height - 1) -i)){
                    System.out.print(c);
                }
                else System.out.print('-');
            }
            System.out.println();
        }
    }
}
