package judith.week20.MultithreadingTests;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);


        thread.start();
        thread2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from Main");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        //Thread.jon(); wenn mehrere gestartet werden warten sie bis alle fertig sind - siehe ThreadSample von Oli

    }
}
