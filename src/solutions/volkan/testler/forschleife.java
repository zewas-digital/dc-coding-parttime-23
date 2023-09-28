package solutions.volkan.testler;

public class forschleife {
    public static void main(String[] args) {
        for (int y = 1; y <= 10 ; y++) {
            System.out.println(y + "er Reihe");
            for (int x = 1; x <=10; x++) {
                System.out.println(x + " * " + y + " = " + x * y);
            }
            System.out.println();
        }
        System.out.println("10");
    }
}
