package examples.week1;

public class Aufgabe1 {
    public static void main(String[] args) {
        int i = 0; // i ist immer eine Zählvariable
        int j = 0;
        while(true) {
            System.out.println(i);
            System.out.println(j);
            if(j < -100) {
                break;
            }
            i++;
            j--;
        }
        System.out.println("Weiter gehts");

    }
}
