package solutions.claudia.week4.example38;

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
        Scanner scanner = new Scanner(System.in);
        int amount;
        double price;
        int discountInPercent;
        double totalDiscount;
        //System.out.print("Wieviele Stück? ");
        //amount = scanner.nextInt();
        amount = 3;
        //System.out.print("Einzelpreis? ");
        //price = scanner.nextDouble();
        price = 3.1;
        //System.out.print("Rabatt in Prozent (Achtung INT)? Sonst 0! ");
        //discountInPercent = scanner.nextDouble();
        discountInPercent = 10;
        System.out.print("Rabattbetrag? Sonst 0! ");
        totalDiscount = scanner.nextDouble();

        if (amount < 0 || price < 0 || discountInPercent < 0 || discountInPercent > 100 || totalDiscount < 0) {
            System.out.println("Keine sinnvollen Eingabewerte!");
        } else {
            if (discountInPercent != 0){
                System.out.println("Gesamtpreis mit Rabatt in Prozent beträgt: " + calculatePrice(amount, price, discountInPercent));
            } else if(totalDiscount != 0){
                System.out.println("Gesamtpreis mit Gesamtrabatt beträgt: " + calculatePrice(amount, price, totalDiscount));
            }
               else
            System.out.print("Gesamtpreis beträgt: " + calculatePrice(amount, price));
        }



    }

    static double runden(double zahl){
        return Math.round(zahl * 100.0)/100.0;
    }

    static double calculatePrice(int amount, double price) {
        //berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
        if (amount > 0 && price > 0) {
            return runden(amount * price);
        } else {
            return -1;
        }
    }

    static double calculatePrice(int amount, double price, int discountInPercent) {
        //berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen Rabatt in Prozent. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
        if (amount > 0 && price > 0 && discountInPercent >= 0 && discountInPercent <= 100) {
            System.out.println(amount + "  " + price + " " + discountInPercent);
            return runden((amount * price) * (1 -discountInPercent/100.0));
        } else {
            return -1;
        }
    }

    static double calculatePrice(int amount, double price, double totalDiscount) {
        //berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen Rabatt (in €). Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
        if (amount > 0 && price > 0 && totalDiscount >= 0) {
            return runden(amount * price - totalDiscount);
        } else {
            return -1;
        }
    }
}
