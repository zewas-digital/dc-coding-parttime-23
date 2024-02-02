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
        System.out.println(pflegerDaniel +"-"+ pflegerBernhard);

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

    public static Zoo erzeugeZoo(String name) {
        // Zoo ----------------------
        Zoo tierpark = new Zoo(name);

        // Pfleger
        Pfleger pflegerDaniel = new Pfleger("Daniel");
        Pfleger pflegerBernhard = new Pfleger("Bernhard");

        // Pfleger Zoos zuweisen
        tierpark.neuerPfleger(pflegerDaniel);
        tierpark.neuerPfleger(pflegerBernhard);

        // Gehege
        Gehege waldrand = tierpark.neuesGehege("Waldrand");
        Gehege weide = tierpark.neuesGehege("Weide");
        Gehege wiese = tierpark.neuesGehege("Wiese");
        Gehege wald = tierpark.neuesGehege("Wald");
        Gehege teich = tierpark.neuesGehege("Teich");


        // Pflegern ihre Verantwortung zuweisen mit Validierung
        tierpark.verantwortlichFuerGehege(pflegerDaniel, waldrand);
        tierpark.verantwortlichFuerGehege(pflegerDaniel, wiese);
        tierpark.verantwortlichFuerGehege(pflegerBernhard, weide);
        tierpark.verantwortlichFuerGehege(pflegerBernhard, waldrand);
        tierpark.verantwortlichFuerGehege(pflegerDaniel, wald);
        tierpark.verantwortlichFuerGehege(pflegerBernhard, teich);

        return tierpark;
    }

}










