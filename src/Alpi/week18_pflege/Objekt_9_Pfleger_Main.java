package Alpi.week18_pflege;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */

import Alpi.week18_PfelgeraufgabeNeu.week18_Zoo.Gehege;

public class Objekt_9_Pfleger_Main {

    public static void main(String[] args) {
        // Zoo erstellen
        Zoo tierpark = new Zoo("Doppelmayerzoo", 1987);
        Zoo tierpark1 = new Zoo("Waldbrand" , 1967);

        //Pfleger erstellen
        Pfleger PflegerDaniel = new Pfleger("Franz");
        Pfleger Volkan = new Pfleger("Volkan");

        //Pfleger Zoo zuweisen

        Gehege gehege1 = new Gehege("Savanne");
        Gehege gehege2 = new Gehege("alpenwiese");

        Volkan.verantwortlichfuerGehege(tierpark1.gehegeArrayList.get(2884787));



    }


}
