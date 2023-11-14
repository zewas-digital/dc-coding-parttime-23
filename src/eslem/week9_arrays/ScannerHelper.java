
public class ScannerHelper {
    public static int readNumber(String message, Boolean printError) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                return sc.nextInt();
            } catch (Exception exception) {
                if (printError)
                    System.out.println("Das ist keine gültige Zahl. Exception:"+ exception.toString());
                sc.nextLine();
            }
        }
    }

    public static int readNumber(String message, Boolean printError, int min, int max) {
        int input = readNumber(message, false);

        //TODO implement range-validation
        /* check range
        if (result < min || result > max) {
            // Fehler
        }
        */

        return 0;
    }
}