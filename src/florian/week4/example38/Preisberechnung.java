package florian.week4.example38;

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
        System.out.println("Wie viel Stück wollen Sie?");
        int amount = scanner.nextInt();
        double price = 9.99;
        System.out.println("Prozentualen Rabatt?");
        int discountinpercent = scanner.nextInt();
        System.out.println("Fixer Rabatt?");
        double totaldiscount = scanner.nextInt();

        double totalsum;

        if (amount < 0 || discountinpercent < 0 || totaldiscount < 0) {
            System.out.println("falsche Werte!");
        } else if (discountinpercent > 0) {
            totalsum = calculatePrice(amount,price,discountinpercent);
            System.out.println(totalsum);
        } else if (totaldiscount > 0) {
            totalsum = calculatePrice(amount,price,totaldiscount);
            System.out.println(totalsum);
        } else {
            totalsum = calculatePrice(amount, price);
            System.out.println(totalsum);
        }

    }

    static double calculatePrice(int amount, double price){
        double totalsum;

        totalsum = amount * price;

        totalsum = (double) Math.round(totalsum * 100) / 100;

        return totalsum;
    }
    static double calculatePrice(int amount , double price, int discountinpercent){
        double totalsum;

        totalsum = amount * price;
        double discount = totalsum / 100 * discountinpercent;
        totalsum = totalsum - discount;


        totalsum = (double) Math.round(totalsum * 100) / 100;

        return totalsum;
    }
    static double calculatePrice(int amount, double price, double totaldiscount){
        double totalsum;

        totalsum = amount * price;

        totalsum = totalsum - totaldiscount;

        totalsum = (double) Math.round(totalsum * 100) / 100;

        return totalsum;
    }

}
