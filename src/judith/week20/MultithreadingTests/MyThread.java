package judith.week20.MultithreadingTests;

import java.sql.SQLOutput;

public class MyThread extends Thread{
    @Override
    public void run() {

       /* try {
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("MEINS");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        */

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from MyThread");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
