package oliver.week18_Zoo;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */

public class Objekt_9_Pfleger {
    public static void main(String[] args) {
        // Zoo ----------------------
        Zoo tierparkDornbirn = new Zoo("Tierpark DB");
        Zoo tierparkFeldkirch = new Zoo("Tierpark FK");

        // Pfleger
        Pfleger pflegerDaniel = new Pfleger("Daniel");
        Pfleger pflegerBernhard = new Pfleger("Bernhard");

        // Pfleger Zoos zuweisen
        tierparkDornbirn.neuerPfleger(pflegerDaniel);
        tierparkDornbirn.neuerPfleger(pflegerBernhard);
        tierparkFeldkirch.neuerPfleger(pflegerBernhard);

        // Gehege
        Gehege waldrandDB = tierparkDornbirn.neuesGehege("Waldrand DB");
        Gehege weideDB = tierparkDornbirn.neuesGehege("Weide DB");
        Gehege waldrandFK = tierparkFeldkirch.neuesGehege("Waldrand FK");

        // Pflegern ihre Verantwortung zuweisen mit Validierung
        tierparkDornbirn.verantwortlichFuerGehege(pflegerDaniel, waldrandDB);
        tierparkDornbirn.verantwortlichFuerGehege(pflegerBernhard, weideDB);
        tierparkDornbirn.verantwortlichFuerGehege(pflegerBernhard, waldrandFK);
        tierparkDornbirn.verantwortlichFuerGehege(pflegerDaniel, waldrandFK); // fehlerhaft

        /* Pflegern ihre Verantwortung zuweisen ohne Validierung
        pflegerDaniel.verantwortlichFuerGehege(waldrandDB);
        pflegerDaniel.verantwortlichFuerGehege(waldrandFK);
        pflegerBernhard.verantwortlichFuerGehege(weideDB);
        pflegerBernhard.verantwortlichFuerGehege(waldrandFK);
         */
    }

}










