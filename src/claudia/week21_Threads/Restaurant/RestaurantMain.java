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

public class RestaurantMain {
    public static void main(String[] args) {

        Oberkellner oberkellner = RestaurantHilfe.erstelleRestaurant();


        for (int i = 0; i < 10; i++) {
            oberkellner.gruppeZuweisen();

        }

        for (Raum raum : oberkellner.getRestaurant().getListeDerRaeume()) {
            System.out.println("* - ".repeat(10) + "*" );
            for (Tisch t : raum.getListeDerTische()) {
                System.out.println(t.getSitzplaetze() + " Sitzplätze;\t\t\t frei? " + t.istFrei() );
            }

        }
    }
}
