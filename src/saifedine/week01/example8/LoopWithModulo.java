package saifedine.week01.example8;

/*
Schreiben Sie ein Programm das in einer Schleife von 0 bis inklusive 10 zählt und nur jede gerade Zahl ausgibt.
Verwenden Sie die For und die While Schleife.

Erstelle für jede Schleifenart Schleifen mit folgenden Unterschieden:
    1. Verwende um zu prüfen, ob es eine gerade Zahl ist den Modulo Operator
    2. Modifiziere die Zählvariable so, dass die Zählvariable nur jede gerade Zahlen enthält

 */

// 0 bis 10 --> nur gerade Zahlen ausgibt
// for > Modulo
// while > Zählvariable nur gerade Zahlen


public class LoopWithModulo {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.println("for: " + i);
            }
        }

        System.out.println();

        int j = 0;

        while (j <= 10){
            System.out.println("while: " + j);
            j += 2;
        }
    }
}
