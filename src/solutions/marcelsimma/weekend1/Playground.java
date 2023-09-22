



package solutions.marcelsimma.weekend1;

public class Playground {

    static void print(String text) {
        System.out.println(text);
    }

    /*
Schreibe ein Programm, das prüft, ob sich eine Zahl innerhalb des
Intervalls [100; 200] befindet.
 */
    static boolean checkNumber1(int number) {
        if (number > 100 && number < 200) {
            return true;
        } else {
            return false;
        }
    }

        /*
Schreibe ein Programm, das prüft, ob sich eine Zahl außerhalb des
Intervalls [100; 200] befindet.
 */
        static boolean checkNumber2(int number) {
            if (number < 100 || number > 200) {
                return true;
            } else {
                return false;
            }
        }


    public static void main(String[] args) {
        // Welche Operatoren kennen wir schon?

        /*
        int zahl1 = 3;
        int zahl2 = 2;

        int ergebnis = (int) Math.pow(zahl1, zahl2);

        System.out.println(ergebnis);
         */

        print("Text");
        System.out.println(checkNumber2(14));
    }
}
