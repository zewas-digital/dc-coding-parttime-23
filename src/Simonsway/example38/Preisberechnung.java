package Simonsway.example38;

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


        System.out.println("Geben sie die Anzahl ein");
        Scanner userInput = new Scanner(System.in); // Hier starte ich den Scanner

        int amount = userInput.nextInt(); // Hier will ich vom Scanner den Amount wissen und speichere es in die Variable amount
        System.out.println("Geben sie den Preis für pro Stück an");
        int price = userInput.nextInt(); // Hier will ich vom Scanner den Preis wissen und speichere es in die Variable price

        System.out.println("Möchten Sie einen Discount?");
        System.out.println();
        System.out.println("0 kein Discount");
        System.out.println("1 für prozent Discount");
        System.out.println("2 für fixen Discount");


        int userSelection = userInput.nextInt(); // Hier frage ich den User ab welche Option er will
        System.out.println("Bitte geben sie der Wert ein");


        if (userSelection == 0){
            System.out.println("Dein Endpreis ist " + calculatePrice(amount, price)); // Hier rufe ich die Mehtode auf und setze von oben Amount und Preis ein das dann nach unten in die Methode geht zum berechen.
        }
        if (userSelection == 1){
            int discountInPercentage = userInput.nextInt(); // Wenn der User 1 wählt dann wird der Eingabewert in die discountPercentage Variable geschrieben und wird dann somit nach unten in die Methode geschickt und wieder zurück gegeben.
            System.out.println("Dein Endpreis ist " + calculatePrice(amount, price, discountInPercentage)); //Hier wird die zweite Mehtode aufgerufen weil ein dritter wert drin ist, somit erkennt das Java und verwednet darum die zweite Mehtode.
        }
        if (userSelection == 2){
            double totalDiscount = userInput.nextDouble();
            System.out.println("Dein Endpreis ist " + calculatePrice(amount, price, totalDiscount)); //Hier ist der dritte wert ein double darum erkennt er das er diese Methode verwenden soll.
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice(int amount, double price){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100) / 100;
            totalPrice = amount * priceRounded;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice(int amount, double price, int discountInPercent){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100.0) / 100.0;
            totalPrice =  (discountInPercent / 100.0) * (priceRounded*amount); // Zuerst die erste Klammer, dann die zweite Klammer und dann Mahl
            totalPrice = (priceRounded*amount) - totalPrice;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice(int amount, double price, double totalDiscount){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100) / 100;
            totalPrice = amount * priceRounded - totalDiscount;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
}
