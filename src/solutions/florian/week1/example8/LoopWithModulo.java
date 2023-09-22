package solutions.florian.week1.example8;

/*
Schreiben Sie ein Programm das in einer Schleife von 0 bis inklusive 10 zählt und nur jede gerade Zahl ausgibt.
Verwenden Sie die For und die While Schleife.

Erstelle für jede Schleifenart Schleifen mit folgenden Unterschieden:
    1. Verwende um zu prüfen, ob es eine gerade Zahl ist den Modulo Operator
    2. Modifiziere die Zählvariable so, dass die Zählvariable nur jede gerade Zahlen enthält

 */

public class LoopWithModulo {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 2== 0) {
                System.out.println(i);
            }
        }
        int j = 0;

        while(j <= 10) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        for (int i = 0; i < 11; i+= 2) {
            System.out.println(i);

        }
        j = 0;

        while(j <= 10) {
            System.out.println(j);
            j+=2;
        }


   }
}
