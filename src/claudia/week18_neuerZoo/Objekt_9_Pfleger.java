package claudia.week18_neuerZoo;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */

import java.util.ArrayList;

public class Objekt_9_Pfleger {
    public static void main(String[] args) {

        Zoo zoo = Zoohilfe.erstelleStandardZooOhnePfleger();

        System.out.println("\nDer Zoo braucht Personal!");
        Pfleger pflegerHansi = new Pfleger("Hansi", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), true);//, zoo.getZustaendig());
        Pfleger pflegerBerni = new Pfleger("Berni", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());

        System.out.println("\nAlle Pfleger im Zoo: ");
        ArrayList<Pfleger> allePfleger = zoo.getListeDerPfleger();
        for (Pfleger p : allePfleger) {
            System.out.println(p.getName());
        }

        System.out.println("\nPfleger " + pflegerHansi.getName() + " betreut Gehege: ");
        ArrayList<Gehege> betreuteGehege = pflegerHansi.getListeDerBetreutenGehege();
        for (Gehege g : betreuteGehege) {
            System.out.println(g.getName());
        }

        System.out.println("\n\nListe der betreuten Gehege: ");
        ArrayList<Object[]> PflegerUndGehegeListe = zoo.getPflegerUndGehegeListe();
        for (int i = 0; i < PflegerUndGehegeListe.size() ; i++) {
            Object [] temp = PflegerUndGehegeListe.get(i);
            System.out.printf("%-25s :  %-25s \n", (Pfleger)temp[0], (Gehege)temp[1]);
        }
/*
        pflegerHansi.gehegeHinzufuegen(zoo.getListeDerGehege().get(0));
        pflegerHansi.gehegeHinzufuegen(zoo.getListeDerGehege().get(1));
        pflegerBerni.gehegeLoeschen(zoo.getListeDerGehege().get(0));
*/
        System.out.println("\n\nListe der betreuten Gehege: ");

        PflegerUndGehegeListe = zoo.getPflegerUndGehegeListe();

        for (int i = 0; i < PflegerUndGehegeListe.size() ; i++) {
            Object [] temp = PflegerUndGehegeListe.get(i);
            System.out.printf("%-25s :  %-25s \n", (Pfleger)temp[0], (Gehege)temp[1]);
        }
/*
        System.out.println(zoo.pflegerZustaendigFuerGehege(zoo.getListeDerPfleger().get(0), zoo.getListeDerGehege().get(0)));
        System.out.println(zoo.pflegerZustaendigFuerGehege(zoo.getListeDerPfleger().get(0), zoo.getListeDerGehege().get(1)));
        System.out.println(zoo.pflegerZustaendigFuerGehege(zoo.getListeDerPfleger().get(1), zoo.getListeDerGehege().get(0)));
        System.out.println(zoo.pflegerZustaendigFuerGehege(zoo.getListeDerPfleger().get(1), zoo.getListeDerGehege().get(1)));
*/
        System.out.println(zoo.pflegerZustaendigFuerGehege2(zoo.getListeDerPfleger().get(0), zoo.getListeDerGehege().get(0)));
        System.out.println(zoo.pflegerZustaendigFuerGehege2(zoo.getListeDerPfleger().get(0), zoo.getListeDerGehege().get(1)));
        System.out.println(zoo.pflegerZustaendigFuerGehege2(zoo.getListeDerPfleger().get(1), zoo.getListeDerGehege().get(0)));
        System.out.println(zoo.pflegerZustaendigFuerGehege2(zoo.getListeDerPfleger().get(1), zoo.getListeDerGehege().get(1)));

    }



}



