package solutions.claudia.week2.extraExamples;

/*
Erstelle eine Methode welche einen Kreis von variabler Größe ausgibt. Der Radius des Kreises soll als Parameter
übergeben werden können.

Verwende dazu Math.Sin(...) und Math.Cos(...) um herauszufinden ob ein Punkt gezeichnet werden soll.

Eine Zeile des IntelliJ Terminals ist etwa 2.6 * höher als ein Zeichen breit ist, dadurch sieht die Ausgabe verzerrt aus.

Aufruf:
printCircleSinCos(10);

Ausgabe:
     **********
    **        **
  **            **
  *              *
 *                *
**                **
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
**                **
 *                *
  *              *
  **            **
    **        **
     **********
 */

public class PrintCircleSinusCosinus {
    public static void main(String[] args) {
        printCircleSinCos(10);
    }

    static void printCircleSinCos(int radius){
        for (int i = 0; i < 2 * radius; i++) {
            for (int j = 0; j < 2 * radius; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(radius, 2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }


}
