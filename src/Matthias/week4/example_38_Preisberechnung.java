package Matthias.week4;

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

public class
example_38_Preisberechnung {
    public static void main( String[] args ){
        boolean status= true;

        // Apfel 1 Stück Preis 5 Euro
        double iStückPreisApfel = 5.2245;
        int iStückApfel = 2;

        // Birne 2 Stück Preis 5 Euro 5% Rabatt
        int iStückBirne = 2;
        double iStückPreisBirne=5.012;
        int iProzentRabatBirne= 5;

        // Anannas  3 Stück Preis 5 Euro  -3 Euro Rabatt
        int iStückAnnanas= 3;
        double iStückPreisAnannas = 5.5454;
        int iAnnanasRabatt=3;

        // Ausgabe der berechneten Werte in die Console

        System.out.println("Apfel Preis: " + calculatePrice(iStückApfel,iStückPreisApfel) );

        System.out.println("Birnen Preis: " +calculatePrice( iStückBirne, iStückPreisBirne,iProzentRabatBirne ) );

        System.out.println( "Annanas Preis: " + calculatePrice2( iStückAnnanas, iStückPreisAnannas,iAnnanasRabatt ));

        while ( status ) {
            userInfo( );
            int menuOption = getValueInt( );
            menuOption=userCheckInput( menuOption );
            if ( menuOption == 1 ){
                iStückApfel=getValueInt();
                iStückPreisApfel=getValueDouble(  );
                double Gesamtrpeis= calculatePrice(iStückApfel,iStückPreisApfel);
                if ( Gesamtrpeis >1) {
                    System.out.println("Apfel Preis: " + Gesamtrpeis);
                }else {
                    status=false;
                }

            }
        }

    }

    // Methode 1: berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis.
    // Runden Sie den Gesamtpreis auf 2 Kommastellen.
    // Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    public static double calculatePrice(int amount, double price) {
        double totalAmount= (double) Math.round( (amount * price)*100)/100;
        return  totalAmount;
    }

    // Methode 2: berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen Rabatt in
    // Prozent. Runden Sie den Gesamtpreis auf
    // 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1
    // als Ergebnis geliefert werden.
    public static double calculatePrice(int amount, double price, int discountInPercent){
        double Gesamtpreis=amount*price;
        double Gesamtpreisminusdiscount=(double) Math.round((Gesamtpreis*((100.0-discountInPercent)/100.0))*100)/100;
        return Gesamtpreisminusdiscount;
    }

    //Methode 3: berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen
    // Rabatt (in €). Runden Sie den Gesamtpreis auf 2 Kommastellen.
    // Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    public static double calculatePrice2(int amount, double price, double totalDiscount) {
        double Gesamtpreis = (amount * price);
        double Gesamtpreisinclusivedis= (double) Math.round((Gesamtpreis-totalDiscount)*100)/100;
        return Gesamtpreisinclusivedis;
    }

    //Methode 4: User Info für Online Shop
    public static void userInfo( ){
        System.out.println("Willkommen im Online Shop zur Preisberechnung von Obstsorten:" );
        System.out.println("1. Berechung des Gesamtpreis aus Menge * Preis" );
        System.out.println("2. Berechnung des Gesamtpreis aus der Anzahl und dem Stückpreis " );
        System.out.println("3. Berechung des Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen Rabatt (in €)");
        System.out.println("4. Beenden" );
        System.out.println(" Bitte Geben Sie eine Zahl von 1-4 ein, um die entsprechende Option zu wählen:" );
    }

    //Methode 5: Einlesen des Benutzer
    public static int userCheckInput(int value){
        if ( value < 1 || value >5  ) {
            return value;
        }else{
            return -1;
        }
    }

    // Methode 6:
    public static double getValueDouble( ) {
        Scanner Scanner = new Scanner( System.in );
        while ( true ) {
            try {
                double UserInput = Scanner.nextDouble( );
                return UserInput;
            } catch (Exception InputMismatchException) {
                System.out.println( "Geben Sie Bitte eine Kommazahl ein:" );
            }
        }
    }
    public static int getValueInt() {
        Scanner Scanner = new Scanner( System.in );
        while ( true ) {
            try {
                int UserInput = Scanner.nextInt( );
                return UserInput;
            } catch (Exception InputMismatchException) {
                System.out.println( "Geben Sie Bitte eine Ganzezahl ein:" );
            }
        }
    }

}
