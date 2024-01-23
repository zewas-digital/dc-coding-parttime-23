package florian.week_18_Pflegeraufgabe;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */




public class Objekt_9_Pfleger {
    public static void main(String[] args) {

        String haken = "├──";
        String haken2 = "│   ├──";
        String haken3 = "│       ├──";

     Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);

     Futterlager futterlager = new Futterlager();

        tierpark.gehegeArrayList.add(new Gehege("Alpen"));
        tierpark.gehegeArrayList.add(new Gehege("Savanne"));
        tierpark.gehegeArrayList.add(new Gehege("Tropen"));

        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Maxi", "Wildschwein", Futterlager.futterarten.HEU, 5));
        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Hugo", "Bär", Futterlager.futterarten.FISCH, 15));
        tierpark.gehegeArrayList.get(1).tiereImGehege.add(new Tiere("Maxiking", "Löwe", Futterlager.futterarten.FISCH, 10));

        System.out.println(haken + " Zoo: " + tierpark.name + ", gegründet " + tierpark.gruendungsjahr);
        for (Gehege s : tierpark.gehegeArrayList) {
            System.out.println(haken2 + " Gehege: " + s.bezeichnung);
            for (Tiere t : s.tiereImGehege) {
                System.out.println(haken3 + "Name: " + t.Name + ", Gattung: " + t.Gattung + ", Futter: " + futterlager.lagerliste.get(t.futter).bezeichnung);
            }
        }





    }
}
