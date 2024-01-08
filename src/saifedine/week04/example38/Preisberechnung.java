package saifedine.week04.example38;

/*
Preisberechnung

Ein Supermarkt eröffnet einen Online-Shop. Es gibt unterschiedliche Varianten der Preisberechnung. Implementieren Sie die aufgelisteten Funktionen zur Berechnung des Gesamtpreises des Lebensmittel-Einkaufs durch Überladen der Funktionen:

    static double calculatePrice(int amount, double price) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, int discountInPercent) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen Rabatt in Prozent. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, double totalDiscount) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen Rabatt (in €). Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.

Hinweise:

    Der errechnete Gesamtpreis darf nicht kleiner 0 sein!
    Genauso darf auch kein negativer Rabatt gewährt werden.
    Für das Runden von Zahlen inkl. Nachkommastellen können Sie die Funktion Math.round() verwenden. Beispiel:

Runden Beispiel:
double x = 123.456
x = (double) Math.round(x * 100) / 100;
Out.println(x); //x hat jetzt den Wert 123.46
 */

import java.util.Scanner;

public class Preisberechnung {

    public static void main(String[] args) {

        double totalprice = 0;
        int amount = -1;
        double price = -1;
        int discountInPercent = -1;
        double totalDiscount = -1;


        Scanner eingabe = new Scanner(System.in);

        while (amount <= 0){
            System.out.println("Wieviel Stück? ");
            amount = eingabe.nextInt();
        }
        while (price <= 0){
            System.out.println("Einzelpreis? ");
            price = eingabe.nextDouble();
        }
        while (discountInPercent < 0 || discountInPercent > 100){
            System.out.println("Rabatt in Prozent (int)? Wenn kein Rabatt (0) eingeben! ");
            discountInPercent = eingabe.nextInt();
        }
        while (totalDiscount < 0){
            System.out.println("Fixer Rabatt in in €? Wenn kein Rabatt (0) eingeben! ");
            totalDiscount = eingabe.nextDouble();
        }

        if (amount > 0 && price > 0){
            System.out.println("Der Gesamtpreis ohne Rabatt beträgt: " + calculatePrice(amount,price));
        }
        if (discountInPercent > 0 && discountInPercent <= 100){
            System.out.println("Der Gesamtpreis abzüglich Rabatt in Prozent beträgt: " + calculatePrice(amount,price,discountInPercent));
        }
        if (totalDiscount > 0) {
            System.out.println("Der Gesamtpreis abzüglich Rabatt in € beträgt: " + calculatePrice(amount,price,totalDiscount));
        }
    }

    // Rundet den Gesamtpreis auf 2 Kommastellen
    static double roundTotalprice(double totalpirce){

        return (double) Math.round(totalpirce * 100) /100;
    }

    // berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis
    // Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price){

        double totalprice = 0;

        totalprice = amount * price;
        totalprice = roundTotalprice(totalprice);

        if (totalprice < 0) {
            totalprice = -1;
        }
        return totalprice;
    }

    // berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen Rabatt in Prozent
    // Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, int discountInPercent){

        double totalprice = 0;

        totalprice = (amount * price) - ((amount * price)/100) * discountInPercent;
        totalprice = roundTotalprice(totalprice);

        if (totalprice < 0) {
            totalprice = -1;
        }
        return totalprice;
    }

    // berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen Rabatt (in €)
    // Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, double totalDiscount){

        double totalprice = 0;

        totalprice = amount * price - totalDiscount;
        totalprice = roundTotalprice(totalprice);

        if (totalprice < 0) {
            totalprice = -1;
        }
        return totalprice;
    }
}
