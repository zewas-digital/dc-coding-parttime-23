package saifedine.week21.oliver_Zoo_Threads;

public class ThreadSample {
    public static void main(String[] args) throws InterruptedException {

        Thread ThreadEins = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print('1');
                }
            }

            ;
        };

        Thread ThreadZwei = new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.print('2');
                }
            }

            ;
        };

        Thread ThreadDrei = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("3");
                    //System.out.println("EFGHIJ");
                }
            }

            ;
        };

        System.out.println("\n Starte Threads ------------");
        ThreadEins.start();
        ThreadZwei.start();
        ThreadDrei.start();

        ThreadDrei.join();
        ThreadZwei.join();
        ThreadEins.join();
        System.out.println("\n Alle Threads beendet ------------");
    }
}
