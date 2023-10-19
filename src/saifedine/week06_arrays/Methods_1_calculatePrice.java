package saifedine.week06_arrays;

/*
static double calculatePrice(int amount, double price) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
 */

public class Methods_1_calculatePrice {

    public static void main(String[] args) {
        int total = 0;

        // artikel 1: 1x 10 EUR
        int postion1 = calculatePrice(1, 10, 4456);

        // artikel 2: 3x 30 EUR
        int position2 = calculatePrice(3, 30, 2234, 10);

        // artikel 2: 3x 30 EUR
        int position3 = calculatePrice(3, 30, 1234);

        total = postion1 + position2 + position3;
        // option: - 10 % rabatt aufs total
    }

    static int calculatePrice(int amount, int price, int articleID) {
        if (articleID == 2234) {
            //TODO option: - 10 % rabatt auf den einzelnen artikel
        }
        return amount * price;
    }
    static int calculatePrice(int amount, int price, int articleID, int percent) {
        //TODO - {percent} % rabatt auf den einzelnen artikel
        return amount * price;
    }
}
