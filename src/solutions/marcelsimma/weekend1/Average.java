package solutions.marcelsimma.weekend1;

public class Average {
    public static void main(String[] args) {

        int startWert = 10;
        int endWert = 20;
        int summe = 0;
        int anzahl = 0; //= endWert - startWert + 1;

        for (int i = startWert; i <= endWert; i++) {
            anzahl++;
            System.out.print(anzahl + ": " + summe + " + " + i + " =");
            summe = summe + i;
            System.out.println(" " + summe);
        }

        System.out.println((double) summe / anzahl);
    }
}
