package claudia.week14_Selbsttest;

public class Prim_Safedine {
    /*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

// https://studyflix.de/mathematik/primzahlen-3161


    public static void main(String[] args) {

        int prim = 100; //bis zu dieser Zahl alle Primzahlen ausgeben. C.
        //noch besser wäre wahrscheinlich eine Frage an den Nutzer, wie groß die Zahl sein soll. ;o) C.

        for (int i = 2; i <= prim; i++) { //Teste alle Zahlen von 2 bis zur oberen Grenze prim, ob sie Primzahlen sind. C.
            if (primzahl(i) == true) { //Nur wenn i eine Primzahl ist, ausgeben. Ansonsten nichts machen. C.
                System.out.println(i + " ");
            }
        }
    }

        static boolean primzahl(int prim){
        //Methode gibt jetzt TRUE zurück, wenn übergebenes Int eine Primzahl ist, ansonsten FALSE. C.
            boolean isPrim = true;
            int j = 2;

            while (isPrim == true && j < prim){ //Aufhören, wenn isPrim = FALSE oder die obere Grenze erreicht ist. C.
                if (prim % j == 0) { //Falls prim durch irgendein j teilbar ist -> keine Primzahl -> isPrim = FALSE. C.
                    isPrim = false;
                    return isPrim;
                }
                j++;
            }
            return isPrim;
        }
    }

