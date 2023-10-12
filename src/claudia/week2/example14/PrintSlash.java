package solutions.claudia.week2.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,
weiters soll der Parameter backslash angegeben werden können. Wenn backslash wahr ist, soll die Diagonale
von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.

Aufruf:
printSlash('x', 3, true);

Ausgabe:
x
 x
  x

Aufruf:
printSlash('y', 4 false);

Ausgabe:
   y
  y
 y
y

 */
public class PrintSlash {
    public static void main(String[] args) {
        printSlash('x',3, true);
        printSlash('y',4, false);
    }

    static void printSlash(char c, int size, boolean backslash) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (backslash){
                        if (j == i) {
                            System.out.print(c);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    else{
                        if (j == (size - 1 - i)) {
                            System.out.print(c);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
    }
}

