package Alpi.week18_pflege;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */

public class Objekt_9_Pfleger_Main {

    public static void main(String[] args) {
        // Zoo erstellen
        Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);


        Pfleger PflegerDaniel = new Pfleger("Franz");



        // Gehege erstellen
        // Gehege alpen = new Gehege("Alpen");---------------------------
        // tierpark.gehegeArrayList.add(alpen);
        tierpark.gehegeArrayList.add(new Gehege("Alpen"));
        tierpark.gehegeArrayList.add(new Gehege("Savanne"));
        tierpark.gehegeArrayList.add(new Gehege("Tropen"));
        //----------------------------------------------------------------


    }


}
