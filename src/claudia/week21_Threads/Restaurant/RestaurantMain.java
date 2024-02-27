package claudia.week21_Threads.Restaurant;

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
