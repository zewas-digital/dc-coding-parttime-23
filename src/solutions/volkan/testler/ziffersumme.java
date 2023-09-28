package solutions.volkan.testler;

public class ziffersumme {
    public static void main(String[] args) {
        int ziffersumme = calculateSumOfDigits( 245);
        System.out.println(ziffersumme);
    }

    static int calculateSumOfDigits(int number){
        int ergebnis = 0;

        while (number > 0) {
            int ziffer = number % 10;
            ergebnis = ergebnis + ziffer;
            number = number / 10;
        }
        return ergebnis;
    }
}
