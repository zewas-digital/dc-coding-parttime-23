package Simonsway.Week3.example38;

// hier die sauber vesion wo jede Methode eien eigenen Namen hat, wenn das nicht der fall ist und immer wieder die gleiche Methode aufgerufen wird gibt es nur mit den Parament in der ersten Klammer die Unterscheidungen

import java.util.Scanner;

public class Preisberechnung_Refactor {
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
            System.out.println("Dein Endpreis ist " + calculatePrice0(amount, price)); // Hier rufe ich die Mehtode auf und setze von oben Amount und Preis ein das dann nach unten in die Methode geht zum berechen.
        }
        if (userSelection == 1){
            int discountInPercentage = userInput.nextInt(); // Wenn der User 1 wählt dann wird der Eingabewert in die discountPercentage Variable geschrieben und wird dann somit nach unten in die Methode geschickt und wieder zurück gegeben.
            System.out.println("Dein Endpreis ist " + calculatePrice1(amount, price, discountInPercentage)); //Hier wird die zweite Mehtode aufgerufen weil ein dritter wert drin ist, somit erkennt das Java und verwednet darum die zweite Mehtode.
        }
        if (userSelection == 2){
            double totalDiscount = userInput.nextDouble();
            System.out.println("Dein Endpreis ist " + calculatePrice2(amount, price, totalDiscount)); //Hier ist der dritte wert ein double darum erkennt er das er diese Methode verwenden soll.
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice0(int amount, double price){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100) / 100;
            totalPrice = amount * priceRounded;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice1(int amount, double price, int discountInPercent){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100) / 100;
            totalPrice = amount * priceRounded + discountInPercent;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
    static double calculatePrice2(int amount, double price, double totalDiscount){
        double totalPrice = 0;

        if (amount >0 && price >0){
            double priceRounded = Math.round(price * 100) / 100;
            totalPrice = amount * priceRounded - totalDiscount;
        }
        return totalPrice;
    }
    ///////////////////////////////////////////////////////////////////////////////////
}



