package Matthias.week1.example8;

/*
Schreiben Sie ein Programm das in einer Schleife von 0 bis inklusive 10 zählt und nur jede gerade Zahl ausgibt.
Verwenden Sie die For und die While Schleife.

Erstelle für jede Schleifenart Schleifen mit folgenden Unterschieden:
    1. Verwende um zu prüfen, ob es eine gerade Zahl ist den Modulo Operator
    2. Modifiziere die Zählvariable so, dass die Zählvariable nur jede gerade Zahlen enthält

 */

public class LoopWithModulo {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            if (i%2==0) {
                System.out.println(i);
            }
            i+=2;
        }
        for (int j = 0; j <=10 ; j+=2) {
            if (j%2==0) {
                System.out.println(j);
            }
        }
    }
}
