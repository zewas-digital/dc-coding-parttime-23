package solutions.judith.weekend1.example21;

public class Malreihe {
    public static void main(String[] args) {

        for (int y = 1; y <=10 ; y++) {
            System.out.println(y + " er Reihe");
            for (int x = 1; x <=10 ; x++) {
                System.out.println(y +" " + "*" + " " + x  + " " +"=" + " " + y * x);
            }
            System.out.println();

        }
    }
}
