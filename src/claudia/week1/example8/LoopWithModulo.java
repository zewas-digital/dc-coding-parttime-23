package solutions.claudia.week1.example8;

/*
Schreiben Sie ein Programm das in einer Schleife von 0 bis inklusive 10 zählt und nur jede gerade Zahl ausgibt.
Verwenden Sie die For und die While Schleife.

Erstelle für jede Schleifenart Schleifen mit folgenden Unterschieden:
    1. Verwende um zu prüfen, ob es eine gerade Zahl ist den Modulo Operator
    2. Modifiziere die Zählvariable so, dass die Zählvariable nur jede gerade Zahlen enthält

 */

public class LoopWithModulo {
    public static void main(String[] args) {
        System.out.println("Variante 1, For-Schleife");
        System.out.println("mit %");
        for (int i = 0; i <= 10; i++) {
            if (i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("nur gerade Zahlen zählen");
        for (int i = 0; i <= 10; i+= 2) {
            System.out.print(i + " ");
        }
///////////////////////////////////////////////////////////////////
        int i = 0;
        System.out.println();
        System.out.println();
        System.out.println("Variante 2, While-Schleife");
        System.out.println("mit %");
        while(i <= 10){
            if (i%2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("nur gerade Zahlen zählen");
        i = 0;
        while(i <= 10){
                System.out.print(i + " ");
                i += 2;
            }

        }
    }

