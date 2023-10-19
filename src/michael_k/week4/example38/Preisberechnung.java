package michael_k.week4.example38;

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

import java.sql.SQLOutput;
import java.util.Scanner;

public class Preisberechnung {

    public static void main(String[] args) {

        int amount;
        double price;
        String rabattabfrage;
        int discountInPercent;
        double totalDiscount;
        boolean rabattAbfrageKorrekt = true;

        Scanner inputKonsole = new Scanner ( System.in );

        System.out.print ("Gib die Menge ein: " );
        amount = inputKonsole.nextInt ();
        System.out.println ("Gib die Menge ein: " );
        price = inputKonsole.nextInt ( );

        while ( rabattAbfrageKorrekt ) {

            System.out.println ( "Wollen sie einen Rabatt geben?" );
            System.out.println ( " p = Prozent / t = Total / k = keiner" );
            rabattabfrage = inputKonsole.next ( );

            if (rabattabfrage.equals ( "p" ) ) {
                System.out.print ( "Wie viel Prozent wollen sie abziehen: " );
                discountInPercent = inputKonsole.nextInt ( );
                double gesamtpreis = calculatePrice ( amount, price, discountInPercent );
                System.out.printf ( "%.2f", gesamtpreis );
                rabattAbfrageKorrekt = false;
            } else if (rabattabfrage.equals ( "t" )) {
                System.out.print ( "Wie viel EUR Rabatt wollen sie abziehen: " );
                totalDiscount = inputKonsole.nextInt ( );
                double gesamtpreis = calculatePrice ( amount, price, totalDiscount );
                System.out.printf ( "%.2f", gesamtpreis );
                rabattAbfrageKorrekt = false;
            } else if (rabattabfrage.equals ( "k" )) {
                double gesamtpreis = calculatePrice ( amount, price );
                System.out.printf ( "%.2f", gesamtpreis );
                rabattAbfrageKorrekt = false;
            } else {
                System.out.println ( "Eingabe ungültig" );
            }

        }
    }

    static double calculatePrice(int amount, double price){
        double gesamtpreis;

        if (amount>0 && price>0) {
            gesamtpreis = amount * price;
        }else{gesamtpreis= -1;}

        return gesamtpreis;
    }

    static double calculatePrice(int amount, double price, int discountInPercent){
        double gesamtpreis;

        if (amount>0 && price>0 && discountInPercent >0 && discountInPercent <101) {
            double discount = ( amount * price ) * ( (double) discountInPercent / 100 );
            gesamtpreis = ( amount * price ) - discount;
        }else{gesamtpreis = -1;}

        return gesamtpreis;
    }

    static double calculatePrice(int amount, double price, double totalDiscount){

        double gesamtpreis = ( amount * price );

        if (amount>0 && price>0 && totalDiscount >0 && totalDiscount < gesamtpreis) {
            gesamtpreis = gesamtpreis - totalDiscount;
        }else {gesamtpreis = -1;}

        return gesamtpreis;
    }
}
