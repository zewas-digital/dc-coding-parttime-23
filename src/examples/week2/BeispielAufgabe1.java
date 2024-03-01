package examples.week2;
/*
Erstellen Sie vier Methoden welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
Die Methode hat 2 Übergabeparameter und keinen Rückgabeparameter. Für jede Methode soll es eine andere Ausrichtung geben.
Die Ausrichtungen sind zuerst einmal Links und Rechts und oben und unten.

Methode 1:
    Aufruf:
    printTriangleBottomLeft('x', 4)

    Ausgabe:
    x
    xx
    xxx
    xxxx

Methode 2:
    Aufruf:
    printTriangleTopLeft('x', 5)

    Ausgabe:
    xxxxx
    xxxx
    xxx
    xx
    x

Methode 3:
    Aufruf:
    printTriangleTopRight('x', 5)

    Ausgabe:
    xxxxx
     xxxx
      xxx
       xx
        x

Methode 4:
    Aufruf:
    printTriangleBottomRight('x', 5)

    Ausgabe:
        x
       xx
      xxx
     xxxx
    xxxxx

 */

public class BeispielAufgabe1 {
        public static void main(String[] args) {
            printTriangleBottomRight('x', 5);
        }

        private static void printTriangleBottomRight(char inputChar, int length) {
            for (int i = 0; i < length + 1; i++) {
                for(int k = 0; k < length; k++) {
                    if(k < length - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(inputChar);
                    }
                }
                System.out.println();
            }
        }

    }


