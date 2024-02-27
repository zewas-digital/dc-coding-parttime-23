package claudia.week21_Threads;

public class ThreadSample {
    public static void main(String[] args) throws InterruptedException {

        Thread ThreadEins = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print('.');
                }
            }

            ;
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
