package judith.week20.MultithreadingTests;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println(" MyRunnable");

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from Runnable");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
