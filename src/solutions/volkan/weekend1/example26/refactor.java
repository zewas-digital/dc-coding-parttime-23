package solutions.volkan.weekend1.example26;
import java.util.Scanner;
public class refactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int zahlInt = scanner.nextInt();

        printSquare('x', zahlInt);

    }
    static void printSquare (char value, int size) {
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print(value);

            }
            System.out.println();
        }
    }
}
