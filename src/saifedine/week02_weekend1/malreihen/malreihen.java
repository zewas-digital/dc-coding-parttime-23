package saifedine.week02_weekend1.malreihen;

public class malreihen {

    public static void main(String[] args) {

        for (int x = 1; x <=10; x++) {

            System.out.println(x + "er Reihe:");

            for (int y = 1; y <=10 ; y++) {

                System.out.println("ergebnis: " + x + " * " + y + " = " + x*y);
            }
            System.out.println();
        }
    }
}