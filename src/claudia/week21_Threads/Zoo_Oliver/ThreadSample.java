package claudia.week21_Threads.Zoo_Oliver;

public class ThreadSample {
    public static void main(String[] args) throws InterruptedException {
        //"anonyme" Implementierung, vgl. DCV-Wiki
        //Klasse wird direkt erzeugt, Methode überschrieben
        //Methode existiert nur jeweils in ihrem eigenen Thread
        //ermöglicht schnelles Testen, ohne eigene Klasse anlegen zu müssen
        //ThreadEins extended nicht Thread, sondern überschreibt direkt
        Thread ThreadEins = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print('.');
                }
            }

        };

        Thread ThreadZwei = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print('*');
                }
            }

            ;
        };

        Thread ThreadDrei = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("|ABCD");
                    System.out.println("EFGHIJ");
                }
            }

            ;
        };

        System.out.println("\n Starte Threads ------------");
        ThreadEins.start();
        ThreadZwei.start();
        ThreadDrei.start();

        ThreadEins.join();
        ThreadZwei.join();
        ThreadDrei.join();

        System.out.println("\n Threads beendet ------------");

    }
}
