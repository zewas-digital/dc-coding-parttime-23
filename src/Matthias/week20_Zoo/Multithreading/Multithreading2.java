
package Matthias.week20_Zoo.Multithreading;
import java.util.List;
import java.util.Vector;



public class Multithreading2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new Vector<>(); //Thread safe

        Thread a = new Thread() {
            public void run() {
                for (int i = 0; i < 10000000; i++) {
                    list.add("Hallo");
                }
            };
        };

        Thread b = new Thread() {
            public void run() {
                for (int i = 0; i < 10000000; i++) {
                    list.add("Hallo");
                }
            };
        };

        a.start();
        b.start();


        a.join();
        b.join();

        System.out.println(list.size());
    }
}