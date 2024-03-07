package claudia.week21_Threads.Restaurant;
/*
Es gibt ein Restaurant, das aus mehreren Räumen besteht. Jeder Raum hat einen zuständigen Kellner.
In jedem Raum befinden sich unterschiedliche Tische. Manche sind groß, andere sind winzig klein.
Wenn eine Gruppe eintrifft, werden sie vom Hauptkellner begrüßt. Der Hauptkellner führt sie zu einem Tisch
und übergibt die Gruppe an den im jeweiligen Raum zuständigen Kellner. Die Gruppe der Gäste bekommt eine
Speisekarte mit den Speisen und Getränken. Der Kellner nimmt die Bestellungen auf und serviert diese anschließend.
Nach dem Essen fragt die Gruppe nach der Rechnung und bezahlt diese.
Am Ende des Tages macht der Hauptkellner eine Gesamtabrechnung und eine Analyse:
Welcher Kellner hat die meisten Gäste bedient?
Welcher Kellner hat den Höchsten Umsatz generiert?
Welcher Kellner hat den größten Gewinn erwirtschaftet? (Dazu braucht man die Selbstkosten pro Speise/Getränk)
Was war die beliebteste Speise?
Was war das beliebteste Getränk?
 */

import java.util.Timer;
import java.util.TimerTask;

public class RestaurantMain {
    public static void main(String[] args) throws InterruptedException {

        Oberkellner oberkellner = Restaurantbuilder.erstelleOberkellner();
        oberkellner.getRestaurant().geoeffnet = true;

        //TODO Anzahl der Gruppen stimmt nicht mehr (?)
        //TODO gegenseitige Abhängigkeiten reduzieren/aufräumen
        //TODO Oberkellner.restaurantschließen beendet nicht main
        //TODO Ist hier das Problem, dass die Threads laufen? Bei nur 3 Sek. funktioniert es.

        Timer oeffnungszeit = new Timer();
        oeffnungszeit.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n\nDas Restaurant schließt jetzt, auf Wiedersehen!");
/*
                try {
                    oberkellner.restaurantSchliessen();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                */

                for (Raum raum : oberkellner.getRestaurant().getListeDerRaeume()) {
                    System.out.println("* - ".repeat(10) + "*" );
                    for (Tisch t : raum.getListeDerTische()) {
                        System.out.println(t.getSitzplaetze() + " Sitzplätze;\t\t\t frei? " + t.istFrei() );
                    }
                }
                this.cancel();
                System.exit(0); //beendet die main-Methode
            }
        }, 30000); //30 Sekunden


        while (oberkellner.getRestaurant().geoeffnet){
            oberkellner.gruppeZuweisen();
            System.out.println("anwesende Gruppen: " + oberkellner.getListeDerGruppen().size());
        }

        for (Raum raum : oberkellner.getRestaurant().getListeDerRaeume()) {
            System.out.println("* - ".repeat(10) + "*" );
            for (Tisch t : raum.getListeDerTische()) {
                System.out.println(t.getSitzplaetze() + " Sitzplätze;\t\t\t frei? " + t.istFrei() );
            }
        }
    }
}
