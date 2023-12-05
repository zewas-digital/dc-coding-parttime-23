package solutions.Simon.example5;

public class Mahlreihen {

    public static void main(String[] args) {
        for (int x = 1; x <=10 ; x++) {
            System.out.println(x + "x" + x + " Reihe");
            for (int y = 1; y <=10 ; y++) {
                System.out.println(x + " * " + y + " = " + y);
            }
        }
    }
}
