package MichaelReal.week20_Restaurant;

/*
        Es gibt ein Restaurant, das aus mehreren Räumen besteht. Jeder Raum hat einen zuständigen Kellner. In jedem Raum befinden sich unterschiedliche Tische. Manche sind groß, andere sind winzig klein. Wenn eine Gruppe eintrifft, werden sie vom Hauptkellner begrüßt. Der Hauptkellner führt sie zu einem Tisch und übergibt die Gruppe an den im jeweiligen Raum zuständigen Kellner. Die Gruppe der Gäste bekommt eine Speisekarte mit den Speisen und Getränken. Der Kellner nimmt die Bestellungen auf und serviert diese anschließend. Nach dem Essen fragt die Gruppe nach der Rechnung und bezahlt diese.
        Am Ende des Tages macht der Hauptkellner eine Gesamtabrechnung und eine Analyse:
        Welcher Kellner hat die meisten Gäste bedient?
        Welcher Kellner hat den Höchsten Umsatz generiert?
        Welcher Kellner hat den größten Gewinnn erwirtschaftet? (Dazu braucht man die Selbstkosten pro Speise/Getränk)
        Was war die beliebteste Speise?
        Was war das beliebteste Getränk?
*/

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Raum> raume = new ArrayList<>();
    private Hauptkellner hauptkellner;

    public Restaurant(Hauptkellner hauptkellner) {
        this.hauptkellner = hauptkellner;
    }

    public void addRaum(Raum raum) {
        raume.add(raum);
    }

    public void tagesanalyseDurchführen() {
        // Implementierung der Logik für die Tagesanalyse
    }

    // Methode, um einem Kellner einen neuen Tisch zuzuweisen
    public void tischZuweisen(Tisch tisch, Kellner neuerKellner) {
        Kellner aktuellerKellner = tisch.getZustandigerKellner();

        // Überprüfen, ob der Tisch bereits einem Kellner zugewiesen ist
        if (aktuellerKellner != null) {
            // Überprüfen, ob der aktuelle Kellner derselbe ist wie der neue Kellner
            if (aktuellerKellner.equals(neuerKellner)) {
                System.out.println("Der Tisch ist bereits dem Kellner " + neuerKellner.getName() + " zugewiesen.");
            } else {
                System.out.println("Warnung: Der Tisch ist bereits einem anderen Kellner zugewiesen. Keine Änderung vorgenommen.");
            }
        } else {
            // Wenn der Tisch keinem Kellner zugewiesen ist, führe die Zuweisung durch
            neuerKellner.addRaum();
            tisch.setZustandigerKellner(neuerKellner);
            System.out.println("Tisch erfolgreich dem Kellner " + neuerKellner.getName() + " zugewiesen.");
        }
    }

}
