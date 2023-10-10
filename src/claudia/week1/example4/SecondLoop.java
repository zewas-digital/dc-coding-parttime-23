package solutions.claudia.week1.example4;

/*
Kopieren Sie die For Schleife des vorherigen Beispiels und geben sie nur jede 2 Zahl aus.


 */
public class SecondLoop {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i+=2){
            System.out.println(i);
        }

        System.out.println("gerade Zahlen:");

        for (int i = 1; i <= 10 ; i++) {
            if ( i%2 == 0)
                System.out.println(i);
        }

        System.out.println("ungerade Zahlen:");

        for (int i = 0; i < 10; i++) {
            if ( i%2 != 0)
                System.out.println(i);
        }
    }

}
