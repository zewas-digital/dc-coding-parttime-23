package eslem.week03.example21;

public class multiplikation {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + "er Reihe");

            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
