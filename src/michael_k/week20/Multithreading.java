package michael_k.week20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = Collections.synchronizedList(new ArrayList<>()); //thread safe
        List<String> list2 = new Vector<>(); // thread safe

        Thread a = new Thread() {
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    list.add("Hallo");

                }
            }

            ;
        };

        Thread b = new Thread() {
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    list.add("Hallo");
                }
            }

            ;
        };

        Thread c = new Thread() {
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    list2.add("Hallo");
                }
            }

            ;
        };

        Thread d = new Thread() {
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    list2.add("Hallo");
                }
            }

            ;
        };
        long startTime1 = System.nanoTime();

        a.start();
        b.start();


        a.join();
        b.join();


        long endTime1 = System.nanoTime();
        System.out.println("ArrayList time: " + ((endTime1 - startTime1)/1000000)+ " ms");
        long startTime2 = System.nanoTime();
        c.start();
        d.start();

        c.join();
        d.join();


        long endTime2 = System.nanoTime();
        System.out.println(list.size());
        System.out.println(list2.size());
        System.out.println("Vector time: " + ((endTime2 - startTime2)/1000000)+ " ms");
    }
}

