package claudia.week21_Threads.Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {

        Oberkellner oberkellner = RestaurantHilfe.erstelleRestaurant();
        System.out.println("\n" + oberkellner.getRestaurant() + " ist jetzt geöffnet. ");

        for (int i = 0; i < 10; i++) {
            oberkellner.gruppeZuweisen();

        }
    }
}
